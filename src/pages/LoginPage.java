package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

import static locators.LoginPageLoc.*;

public class LoginPage extends Page {

    private boolean login = false;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {

        System.out.println(driver.getTitle());
        return driver.getTitle();

    }

    @Override
    public boolean openPage() {
        return true;

    }

    public boolean login() throws NotLoggedInException {

        if (driver.getTitle().contains("PowerSteering")) {
            // Enter login
            driver.findElement(By.id(LOGIN.getLocator())).sendKeys("gregoryk");
            // Enter password
            driver.findElement(By.id(PASSWORD.getLocator())).sendKeys("gregory82");
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
