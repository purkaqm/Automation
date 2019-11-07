package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TDListPageLoc.*;

public class AddTDPopUp extends AddTagPopUp {
    public AddTDPopUp(WebDriver driver, String tdName) {
        super(driver, tdName);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }

    public AddTDPopUp setName() {
        log("Set tag name: " + tagName);
        driver.findElement(By.xpath(NAME_TD_FLD.getLocator())).sendKeys(tagName);
        return this;
    }
    
    public void submitForm(){
        log("Submit TD form");
        super.submitForm();
    }
}
