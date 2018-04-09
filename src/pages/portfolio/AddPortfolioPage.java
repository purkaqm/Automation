package pages.portfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.portfolios.AddPortfolioPageLoc.*;

public class AddPortfolioPage extends Page {

    private static String portfolioName;

    AddPortfolioPage(WebDriver driver, String portfolioName) {
        super(driver);
        this.portfolioName = portfolioName;
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean pageIsOpened() throws NotLoggedInException {
        return driver.getTitle().contains("Portfolios: Define Portfolio");
    }

    public void addName() {
        driver.findElement(By.id(NAME_FIELD.getLocator())).sendKeys(portfolioName);

    }


    public PortfolioSummaryPage saveChangesBtn() {
        driver.findElement(By.id(SAVE_CHANGES.getLocator())).click();

        return new PortfolioSummaryPage(driver);
    }
}
