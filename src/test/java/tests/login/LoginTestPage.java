package tests.login;

import static org.testng.Assert.assertTrue;

import pages.LoginPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;
import org.testng.annotations.Test;

public class LoginTestPage extends TestPage {

    @Test
    public void testLogin() throws NotLoggedInException {
        assertTrue(new LoginPage(driver).login("gregoryk", "gregory82"));
    }
}
