package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.exception.NotLoggedInException;

import java.util.concurrent.TimeUnit;

import static locators.CommonLoc.*;

public class TestPage {

    private void login(String login, String password) throws NotLoggedInException {
        new LoginPage(driver).login(login, password);
    }

    protected void login() throws NotLoggedInException {
        login("gregoryk", "gregory82");
    }


    protected static WebDriver driver;

    // Инициализация вебдрайвера
    // ChromeDriver

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        // headless driver - browser should not be launched

        driver = new ChromeDriver(new ChromeOptions().setHeadless(false));

        // Время ожидания элемента

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Открываем контекст

        driver.get(CONTEXT_URL.getLocator());
    }

    @AfterSuite
    public void tearDown() {
        driver.close();
    }


    public void pause(int secs){
        try {
            Thread.sleep(secs*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
