package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TagsListPageLoc.*;

public class AddTagPopUp extends Page {

    String tagName;


    public AddTagPopUp(WebDriver driver, String tagName) {
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

    public AddTagPopUp setName() {
        log("Set tag name: " + tagName);
        driver.findElement(By.xpath(NAME_FLD.getLocator())).sendKeys(tagName);
        return this;

    }

    public void submitForm() {
        log("Click on Add button");
        driver.findElement(By.xpath(SUBMIT_BTN.getLocator())).click();
    }

    public AddTagPopUp selectWorkType(String workTypeName) {
        log("Open Work Type menu");
        driver.findElement(By.xpath(WORK_TYPE_FLD.getLocator())).click();
        log("Select [" + workTypeName + "] work type");
        driver.findElement(By.xpath(WORK_TYPE_ITEM.getWorkType(workTypeName))).click();
        log("Click on DONE button");
        driver.findElement(By.xpath(WORK_TYPE_DONE.getLocator())).click();
        return this;
    }
}
