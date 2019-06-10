package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

import static locators.loginPage.LoginPageLoc.*;

public class LoginPage extends Page {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {

        return driver.getTitle();

    }

    @Override
    public boolean openPage() {
        return false;

    }

    public boolean login(String login, String password) throws NotLoggedInException {

        // Check session

        if (loggedIn) {
            return loggedIn;
        }


        //Change Locale to English
        if (driver.findElement(By.id(LOCALE.getLocator())).isDisplayed()) {
            driver.findElement(By.id(LOCALE.getLocator())).click();
            driver.findElement(By.xpath(LOCALE_ENGLISH.getLocator())).click();
        }

        if (driver.getTitle().contains("PowerSteering")) {
            // Enter login
            driver.findElement(By.id(LOGIN.getLocator())).sendKeys(login);
            // Enter password
            driver.findElement(By.id(PASSWORD.getLocator())).sendKeys(password);
            // Click on Entering button
            driver.findElement(By.xpath(LOGIN_BTN.getLocator())).click();
        }

        if (driver.getTitle().contains("Home")) {
            loggedIn = true;
            return loggedIn;
        } else {
            loggedIn = false;
            throw new NotLoggedInException("Login Failed");
        }
    }
}
