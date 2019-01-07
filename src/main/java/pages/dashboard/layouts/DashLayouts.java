package pages.dashboard.layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.dashboard.DashLayoutsLoc.*;
import static locators.CommonLoc.*;


public class DashLayouts extends Page {
    public DashLayouts(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        driver.get(CONTEXT_URL.getLocator() + DASHBOARD_LAYOUTS_GRID_URL.getLocator());
        return driver.getTitle().contains("Dashboard Layouts");
    }

    public Step1 AddNewBtn() {
        driver.findElement(By.xpath(ADD_NEW_TOP_BTN.getLocator())).click();
        return new Step1(driver);
    }
}
