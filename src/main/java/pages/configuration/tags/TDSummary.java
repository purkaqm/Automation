package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TDListPageLoc.*;

public class TDSummary extends Page {
    public TDSummary(WebDriver driver) {
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

    public void selectRoot(String tagName){
        log("Click on TOP");
        driver.findElement(By.xpath(TOP.getLocator())).click();
        log("Select Tag Name");
        driver.findElement(By.xpath(TAG_MENU.getLocator())).click();



    }
}
