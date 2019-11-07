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

    public AddTDPopUp clickAddTD(String tdName) throws NotLoggedInException {
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

    public void removeTD(String tdName) throws NotLoggedInException {
        openPage();
        log("Remove [" + tdName + "TD, open action menu");
        driver.findElement(By.xpath(TD_DD_MENU.getLocator(tdName))).click();
        log("Select delete menu value");
        driver.findElement(By.xpath(DELETE_MENU_VALUE.getLocator())).click();
        log("Submit removal");
        driver.findElement(By.xpath(CONFIRM_YES.getLocator())).click();
    }
}
