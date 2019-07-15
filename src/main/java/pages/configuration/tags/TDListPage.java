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

        log("Open TD grid page");
        driver.get(context + TD_GRID_PAGE_URL.getLocator());
        return false;
    }

    public AddTDPopUp addTD(String tdName) throws NotLoggedInException {
        openPage();
        log("Click on ADD new td button");
        driver.findElement(By.xpath(ADD_NEW_BTN.getLocator())).click();
        return new AddTDPopUp(driver, tdName);
    }

    public TDSummary openTD(String tdName) throws NotLoggedInException {
        openPage();
        log("Open [" + tdName + "] tag dependency");
        driver.findElement(By.xpath(TD_NAME.getLocator(tdName))).click();

        return new TDSummary(driver);
    }
}
