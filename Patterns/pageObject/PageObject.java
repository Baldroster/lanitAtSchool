package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {
    //Аннотация FindBy указывает на путь до необходимого нам элемента
    @FindBy(id = "text")
    WebElement searchLine;

    @FindBy(xpath = "//div[@class='search2__button']/button")
    WebElement searchButton;


    //Инкапсулирование логики реализации поиска.
    //Если логика поиска на странице изменится, то исправить ее нужно будет только здесь, а не в каждом тесте
    public void searchTextInYandex(String text){
        searchLine.sendKeys(text);
        searchButton.click();

    }
}
