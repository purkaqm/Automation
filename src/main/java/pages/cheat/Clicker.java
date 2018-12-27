package pages.cheat;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Page;
import pages.exception.NotLoggedInException;

public class Clicker extends Page {

    String url = "http://xn----7sbaf6bff6be2c7c6ah.xn--p1ai/v-obraze-literaturnogo-geroya.html#prettyPhoto";

    public Clicker(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean pageIsOpened() throws NotLoggedInException {

            driver.get("http://xn----7sbaf6bff6be2c7c6ah.xn--p1ai/v-obraze-literaturnogo-geroya.html#prettyPhoto");

            System.out.println("Page opens");

            WebElement element = driver.findElement(By.xpath("//label[@for='ans44']"));

            System.out.println(element.getTagName());
            element.click();

            WebElement button = driver.findElement(By.xpath("//div[@class='plg-button']/strong"));

            // System.out.println("Кнопка ответить есть - "+button.isDisplayed());

            button.click();


        return true;
    }
}
