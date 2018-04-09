package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.exception.NotLoggedInException;

public class HomePageTest extends PageTest {


    @Test
    public void testHomePageOpens() throws NotLoggedInException {

        new LoginPage(driver).login("gregoryk","gregory82");
        Assert.assertTrue(new HomePage(driver).pageIsOpened());

    }
}
