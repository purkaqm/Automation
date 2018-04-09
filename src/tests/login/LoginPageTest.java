package tests.login;

import static org.junit.Assert.*;
import org.junit.Test;
import pages.LoginPage;
import pages.exception.NotLoggedInException;
import tests.PageTest;

public class LoginPageTest extends PageTest {

    @Test
    public void testLogin() throws NotLoggedInException {
        assertTrue(new LoginPage(driver).login("gregoryk","gregory82"));
    }
}
