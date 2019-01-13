package tests.homePage;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

import static org.testng.Assert.assertTrue;

public class HomeTestPage extends TestPage {


    @Test
    public void testHomePageOpens() throws NotLoggedInException {

        login();
        assertTrue(new HomePage(driver).openPage());

    }
}
