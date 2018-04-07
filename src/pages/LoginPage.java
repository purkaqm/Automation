package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    public void openPage() {

    }

    public boolean login() {

        driver.findElement(By.id(LOGIN.getLocator())).sendKeys("gregoryk");
        driver.findElement(By.id(PASSWORD.getLocator())).sendKeys("gregory82");


        return login;
    }
}
