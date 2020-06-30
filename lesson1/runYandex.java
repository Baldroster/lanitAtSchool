import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class runYandex {
    public static void main(String[] args) {
        //Установка пути  до драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        //Создание экземпляра драйвера
        WebDriver driver=new ChromeDriver();
        //Установка размера окна браузера, как максимально возможное
        driver.manage().window().maximize();
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
        //Загрузим другую страницу
        driver.get("https://www.google.com");
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Закрываем текущее окно браузера
        driver.close();
    }
}
