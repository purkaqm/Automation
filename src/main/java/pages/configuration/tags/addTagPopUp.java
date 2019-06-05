package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TagsListPageLoc.*;

public class addTagPopUp extends Page {

    String tagName;


    public addTagPopUp(WebDriver driver, String tagName) {
        super(driver);
        this.tagName = tagName;
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }

    public void setName() {
        log("Set tag name: " + tagName);
        driver.findElement(By.xpath(NAME_FLD.getLocator())).sendKeys(tagName);
        log("Click on Add button");
        driver.findElement(By.xpath(SUBMIT_BTN.getLocator())).click();
    }
}
