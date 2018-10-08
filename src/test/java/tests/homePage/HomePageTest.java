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

        new LoginPage(driver).login("gregoryk","gregory82");
        assertTrue(new HomePage(driver).pageIsOpened());

    }
}
