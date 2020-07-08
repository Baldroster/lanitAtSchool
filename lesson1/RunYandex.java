import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class RunYandex {
    public static void main(String[] args) {
        //Установка пути  до драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        //Создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //Устанавливаем размер окна браузера, как максимально возможный
        driver.manage().window().maximize();
        //Установим время ожидания для поиска элементов
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Загрузка новой страницы в текущем окне браузера
        driver.get("https://www.yandex.ru");

        System.out.println(
                //Получаем исходник страницы
                driver.getPageSource()
        );
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Перезагрузим страницу
        driver.navigate().refresh();
        //Загрузим другую страницу с помощью Navigation
        driver.navigate().to("https://www.google.com");

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Закрываем текущее окно браузера
        driver.close();
    }
}
