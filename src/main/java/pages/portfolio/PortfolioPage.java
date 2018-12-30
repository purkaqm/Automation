package pages.portfolio;

import locators.portfolios.PortfolioPageLoc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Page;

import static locators.portfolios.PortfolioPageLoc.*;

public class PortfolioPage extends Page {
    public PortfolioPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean pageIsOpened() {
        driver.get(context + PORTFOLIO_PAGE_URL.getLocator());
        return driver.getTitle().contains("Portfolios | PowerSteering");
    }

    public AddPortfolioPage addPortfolioBtn(String portfolioName) {
        driver.findElement(By.xpath(ADD_PORTFOLIO_BTN.getLocator())).click();

        return new AddPortfolioPage(driver, portfolioName);
    }

    public boolean searchPortfolioByName(String portfolioName) {

        return false;
    }

    public boolean removePortfolio(String portfolioName) {
        actionMenuSelectValue(portfolioName, ACTION_MENU_DELETE);

        return false;
    }

    public boolean openPortfolio(String portfolioName) {
        actionMenuSelectValue(portfolioName, ACTION_MENU_VIEW);
        return false;
    }


    public boolean actionMenuSelectValue(String portfolioName, PortfolioPageLoc menuValue) {
        WebElement locator;

        // Open Action menu for the specified portfolio
        WebElement menu = driver.findElement(By.xpath(ACTION_MENU.getLocator(portfolioName)));
        menu.click();


        switch (menuValue) {
            case ACTION_MENU_VIEW:
                locator = driver.findElement(By.xpath(ACTION_MENU_VIEW.getLocator()));
                locator.click();
                break;
            case ACTION_MENU_COPY:
                locator = driver.findElement(By.xpath(ACTION_MENU_COPY.getLocator()));
                break;
            case ACTION_MENU_DELETE:
                // select Delete in the Action menu
                locator = driver.findElement(By.xpath(ACTION_MENU_DELETE.getLocator()));
                locator.click();
                // click on DELETE button
                driver.findElement(By.xpath(DELETE_BTN.getLocator())).click();
                break;
            default:
                locator = null;
        }


        return false;
    }
}
