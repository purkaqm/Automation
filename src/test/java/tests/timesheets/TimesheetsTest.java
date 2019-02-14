package tests.timesheets;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;

import pages.timesheets.Timesheets;
import tests.TestPage;
import widgets.Calendar;

public class TimesheetsTest extends TestPage {
    private Timesheets timesheets;


    @Parameters("userID")
    @Test(priority = -1, enabled = false)
    public void openProfile(String userID) throws NotLoggedInException {

        login();
        timesheets = new Timesheets(driver);
        Assert.assertTrue(timesheets.openProfile(userID));
    }

    @Test(enabled = false)
    public void openProfile() throws NotLoggedInException {
        login();
        timesheets = new Timesheets(driver);
        Assert.assertTrue(timesheets.openPage());

    }

    @Test(enabled = false)
    public void openCalendarWidget() throws NotLoggedInException {
        login();
        timesheets = new Timesheets(driver);
        timesheets.openPage();
        Assert.assertTrue(timesheets.getCalendar().isVisible(), "Calendar is not visible");
    }

    @Test(enabled = false)
    public void getCalendarItems() throws NotLoggedInException {
        login();
        timesheets = new Timesheets(driver);
        timesheets.openProfile("18u12a80000m0hahpbqg000000");
        Calendar calendar = timesheets.getCalendar();

        calendar.getTable();
    }

    @Test(enabled = true)
    public void selectDate() throws NotLoggedInException {

        /*login();
        timesheets = new Timesheets(driver);
        timesheets.openPage();
        //    Calendar calendar = timesheets.getCalendar();

        System.err.println("NUMBER: " + timesheets.getStartDate());
        timesheets.setStartDate("05/05/2005");
       System.err.println("NUMBER: " + timesheets.getStartDate());*/

        timesheets = new Timesheets(driver);
        timesheets.setStartDate("05/05/2005");





    }


}
