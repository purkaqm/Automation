package pages.portfolio;

import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class AddPortfolioPage extends Page{
     AddPortfolioPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean pageIsOpened() throws NotLoggedInException {
        return driver.getTitle().contains("Portfolios: Define Portfolio");
    }
}
