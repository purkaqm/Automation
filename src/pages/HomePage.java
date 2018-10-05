package pages;

import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

import static locators.homePage.HomePageLoc.*;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean pageIsOpened() throws NotLoggedInException {
        driver.get(context + HOME_PAGE_URL.getLocator());

        return driver.getTitle().contains("Home");
    }
}
