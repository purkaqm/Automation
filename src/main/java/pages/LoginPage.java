package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

import static locators.loginPage.LoginPageLoc.*;

public class LoginPage extends Page {

    private boolean login = false;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {

        return driver.getTitle();

    }

    @Override
    public boolean pageIsOpened() {
        return false;

    }

    public boolean login(String login, String password) throws NotLoggedInException {

        if (driver.getTitle().contains("PowerSteering")) {
            // Enter login
            driver.findElement(By.id(LOGIN.getLocator())).sendKeys(login);
            // Enter password
            driver.findElement(By.id(PASSWORD.getLocator())).sendKeys(password);
            // Click on Entering button
            driver.findElement(By.xpath(LOGIN_BTN.getLocator())).click();
        }

        if (driver.getTitle().contains("Home")) {
            return true;
        } else {
            throw new NotLoggedInException("Login Failed");
        }
    }
}
