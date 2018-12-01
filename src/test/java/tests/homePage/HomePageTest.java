package tests.homePage;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.exception.NotLoggedInException;
import tests.PageTest;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends PageTest {


    @Test
    public void testHomePageOpens() throws NotLoggedInException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("gregoryk", "gregory82");
        System.out.println(loginPage.pageTitle());
        assertTrue(new HomePage(driver).pageIsOpened());

    }
}
