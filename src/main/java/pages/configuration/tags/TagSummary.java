package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TagSetSummary.*;

public class TagSummary extends Page {
    public TagSummary(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }


    public void updateValues(String[] values) {
        log("Click on UPDATE button");
        driver.findElement(By.xpath(UPDATE_BTN.getLocator())).click();

    }
}
