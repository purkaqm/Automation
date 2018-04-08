package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.exception.NotLoggedInException;

public class HomePageTest extends PageTest {


    @Test
    public void testHomePage() throws NotLoggedInException {
        Assert.assertTrue(new HomePage(driver).openPage());

    }
}
