package pages.portfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
}
