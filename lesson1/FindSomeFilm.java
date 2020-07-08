import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindSomeFilm {
    public static void main(String[] args) {
        //Часть 1

        //Установка пути  до драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        //Создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //Устанавливаем размер окна браузера, как максимально возможный
        driver.manage().window().maximize();
        //Установим время ожидания для поиска элементов
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Загрузка новой страницы в текущем окне браузера
        driver.get("https://www.kinopoisk.ru/");

        //Найдем элемент по селектору
        WebElement params = driver.findElement(By.cssSelector(".nsbkofuuSifuaoskfpZh2"));
        //И кликнем по нему
        params.click();
        //Найдем элемент по XPath
        driver.findElement(By.xpath("//input[@id='find_film']")).sendKeys("Назад в будущее");


        //Часть 2

        //Получим элемент класса Select
        Select yearSelect = new Select(driver.findElement(By.xpath("//select[@id='to_year']")));

        //Выведем в консоль содержимое выпадающего списка
        yearSelect.getOptions().forEach(element -> {
            System.out.println("Text = " + element.getText() + ";Value = " + element.getAttribute("value"));
        });

        //Выберем значение в выпадающем списке
        yearSelect.selectByValue("1986");

        //Выберем несколько значений в выпадающем списке
        Select genreSelect = new Select(driver.findElement(By.xpath("//select[@class='text el_6 __genreSB__']")));
        genreSelect.selectByVisibleText("фантастика");
        genreSelect.selectByVisibleText("комедия");
        genreSelect.selectByVisibleText("приключения");

        //Выведем в консоль выбранные пункты выпадающего списка
        genreSelect.getAllSelectedOptions().forEach(element -> {
            System.out.println("Text = " + element.getText() + ";Value = " + element.getAttribute("value"));
        });


        //Часть 3

        //Активирум чекбокс, если он еще не был активирован
        WebElement genreCheckbox = driver.findElement(By.xpath("//input[@id='m_act[genre_and]']"));
        if (!genreCheckbox.isSelected()) {
            genreCheckbox.click();
        }

        //Нажимаем кнопку поиск
        driver.findElement(By.xpath("//input[@class='el_18 submit nice_button']")).click();

        //Часть 4
        //Мы можем так же искать коллекции элементов...
        List<WebElement> listOfOtherFilms = driver.findElements(By.xpath("//div[@class='search_results search_results_last']/div[@class='element']"));

        for (int i = 0; i < listOfOtherFilms.size(); i++) {
            System.out.print("Фильм " +
                    //...И дочерние узлы WebElement'a
                    listOfOtherFilms.get(i).findElement(By.xpath(".//div[@class='info']/p")).getText());
            try {
                System.out.println(". Имеет рейтинг " + listOfOtherFilms.get(i).findElement(By.xpath(".//div[@class='rating  ratingGreenBG']")).getText());

            } catch (NoSuchElementException e) {
                System.out.println(". Не имеет рейтинга");
            }
        }
    }
}
