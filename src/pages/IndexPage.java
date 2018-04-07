package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static locators.IndexPageLoc.*;

public class IndexPage extends Page {

    private String page_url;

    public IndexPage(WebDriver driver, String page) {
        super(driver);
        this.page_url = page;
    }


    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public void openPage() {
        driver.get(page_url);

        try {
            driver.findElement(By.id("")).click();
        } catch (NoSuchElementException e) {
            System.err.println(BUTTON + " is not found");
            return;
        }

    }
}
