package pages;

import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

import static locators.HomePageLoc.*;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return "Home page is NOT loaded";
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean openPage() throws NotLoggedInException {


        if (new LoginPage(driver).login()) {
            driver.get(HOME_PAGE_URL.getLocator());
        }
        return true;
    }
}
