import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Timeouts {
    static WebDriver driver = new ChromeDriver();
    static WebElement params;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver.manage().window().maximize();


        javaWait();

        implicitlyWait();

        //explicitly wait
        webDriverWait();
        fluentWait();

        driver.close();


    }

    private static void javaWait() {
        driver.get("https://www.kinopoisk.ru/");

        //Механизм ожидания предоставляемый Java
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        params = driver.findElement(By.cssSelector(".nsbkofuuSifuaoskfpZh2"));

        params.click();
    }

    private static void implicitlyWait() {
        driver.get("https://www.kinopoisk.ru/");

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        params = driver.findElement(By.cssSelector(".nsbkofuuSifuaoskfpZh2"));


        params.click();

        //сбросим время неявного ожидания
        driver.manage().timeouts().implicitlyWait(0, SECONDS);

    }
    private static void webDriverWait(){
        driver.get("https://www.kinopoisk.ru/");

        //webdriver wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        params = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nsbkofuuSifuaoskfpZh2")));

        params.click();
    }

    private static void fluentWait(){
        driver.get("https://www.kinopoisk.ru/");

        //fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        params = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nsbkofuuSifuaoskfpZh2")));

        params.click();
    }
}
