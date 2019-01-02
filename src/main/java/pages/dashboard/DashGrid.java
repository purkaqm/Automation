package pages.dashboard;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.dashboard.DashboardGridLoc.*;

public class DashGrid extends Page {
    public DashGrid(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        driver.get(context + DASHBOARD_GRID_URL.getLocator());
        return driver.getTitle().contains("Dashboard");
    }

    public void selectPortfolio(String portfolioName) {
        // click on Portfolio menu
        driver.findElement(By.xpath(PORTFOLIO_MENU.getLocator())).click();
        // select Portfolio
        driver.findElement(By.xpath(PORTFOLIO.getLocator(portfolioName))).click();
    }

    public void selectLayout(String dashlayout) {
        // click on Layout menu
        driver.findElement(By.xpath(LAYOUT_MENU.getLocator())).click();
        // select Layout
        driver.findElement(By.xpath(LAYOUT.getLocator2(dashlayout))).click();
    }

    public void clickGo() {
        // Click on GO button
        driver.findElement(By.xpath(GO_BTN.getLocator())).click();
    }

    public void selectSecondPortfolio(String portfolioName) {
        //click on Split Portfolio button
        driver.findElement(By.xpath(PORTFOLIO_COMPARE_BTN.getLocator())).click();
        //open Second Portfolio Menu
        driver.findElement(By.xpath(PORTFOLIO_MENU_2.getLocator())).click();
        //select second Portfolio
        driver.findElement(By.xpath(PORTFOLIO2.getLocator3(portfolioName))).click();
    }


}
