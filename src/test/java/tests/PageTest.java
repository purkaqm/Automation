package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.exception.NotLoggedInException;

import java.util.concurrent.TimeUnit;

import static locators.CommonLoc.*;

public class PageTest {

    protected void login(String login, String password) throws NotLoggedInException {
        new LoginPage(driver).login(login, password);
    }

    protected void login() throws NotLoggedInException {
        login("gregoryk", "gregory82");
    }


    protected ChromeDriver driver;

    // Инициализация вебдрайвера
    // ChromeDriver

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        // Время ожидания элемента

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Открываем контекст

        driver.get(CONTEXT_URL.getLocator());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
