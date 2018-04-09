package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.exception.NotLoggedInException;

public class LoginPageTest extends PageTest {

    @Test
    public void testLogin() throws NotLoggedInException {
        Assert.assertTrue(new LoginPage(driver).login("gregoryk","gregory82"));
    }
}
