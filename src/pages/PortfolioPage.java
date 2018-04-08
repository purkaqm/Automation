package pages;

import org.openqa.selenium.WebDriver;

import static locators.PortfolioPageLoc.*;

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

    public void addPortfolio() {

    }
}
