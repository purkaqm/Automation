package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TDListPageLoc.*;

public class TDListPage extends Page {

    public TDListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        driver.get(context + TD_GRID_PAGE_URL.getLocator());
        return false;
    }

    public TDListPage addTD() throws NotLoggedInException {
        openPage();
        driver.findElement(By.xpath(ADD_NEW_BTN.getLocator())).click();
        return this;
    }
}
