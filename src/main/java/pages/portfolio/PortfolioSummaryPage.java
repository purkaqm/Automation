package pages.portfolio;

import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class PortfolioSummaryPage extends Page {

    private String portfolioName;

    protected PortfolioSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean pageIsOpened() throws NotLoggedInException {
        return false;
    }

    public String getPortfolioName() {
        return "";
    }
}
