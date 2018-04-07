package tests;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.IndexPage;
import pages.NotLoggedInException;

import java.util.concurrent.TimeUnit;

import static locators.CommonLoc.*;

public class HomePageTest {


    private ChromeDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(CONTEXT_URL.getLocator());

    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testLogin() throws NotLoggedInException {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.login());
    }

    @Test
    public void testIndexPage() throws TitleNotFoundException {
        IndexPage page = new IndexPage(driver, CONTEXT_URL.getLocator());
        page.openPage();

        System.out.println("Current page title --- " + page.pageTitle());

        try {
            Assert.assertTrue(page.pageTitle().equals("Index"));
        } catch (AssertionError e) {

            // TitleNotFoundException should be thrown here

            System.err.println("Title isn't found");
            throw new TitleNotFoundException("Title isn't found!!!", e);

        }


    }


}
