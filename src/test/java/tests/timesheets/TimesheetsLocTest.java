package tests.timesheets;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;

import pages.timesheets.Timesheets;
import tests.TestPage;

public class TimesheetsLocTest extends TestPage {
    private Timesheets timesheets;


    @Parameters("userID")
    @Test(priority = -1)
    public void openProfile(String userID) throws NotLoggedInException {

        login();
        timesheets = new Timesheets(driver);
        Assert.assertTrue(timesheets.openProfile(userID));
    }

    @Test
    public void openProfile() throws NotLoggedInException {
        login();
        timesheets = new Timesheets(driver);
        Assert.assertTrue(timesheets.openPage());

    }


}
