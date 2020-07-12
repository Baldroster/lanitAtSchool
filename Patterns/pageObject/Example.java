package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Example {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        //Создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //Откроем страницу
        driver.get("https://yandex.ru");

        //Инициализация элементов страницы
        PageObject page = PageFactory.initElements(driver,PageObject.class);

        //Выполним взаимодействие с панелью поиска
        page.searchTextInYandex("google");
        driver.quit();
    }
}
