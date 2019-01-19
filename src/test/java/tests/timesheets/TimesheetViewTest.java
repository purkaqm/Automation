package tests.timesheets;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;

import pages.timesheets.TimesheetsView;
import tests.TestPage;

public class TimesheetViewTest extends TestPage {


    @Parameters("userID")
    @Test
    public void openProfile(String userID) throws NotLoggedInException {
        TimesheetsView timesheetViewPage;

        login();
        timesheetViewPage = new TimesheetsView(driver);
        Assert.assertTrue(timesheetViewPage.openProfile(userID));
    }
}
