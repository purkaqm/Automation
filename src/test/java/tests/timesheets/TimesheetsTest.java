package tests.timesheets;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;

import pages.timesheets.Timesheets.Timesheets;
import pages.timesheets.Timesheets.WorkItem;
import tests.TestPage;
import widgets.Calendar;

public class TimesheetsTest extends TestPage {
    private Timesheets timesheets;
    private WorkItem workItem;


    @Parameters("userID")
    @Test(priority = -1, enabled = false)
    public void openProfile(String userID) throws NotLoggedInException {

        login();
        timesheets = new Timesheets(driver);
        Assert.assertTrue(timesheets.openProfile(userID,true));
    }

    @Test(enabled = true)
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

    @Test(enabled = true)
    public void getCalendarItems() throws NotLoggedInException {
        login();
        timesheets = new Timesheets(driver);
        timesheets.openProfile("18u12a80000m0hahpbqg000000",true);
        Calendar calendar = timesheets.getCalendar();

        calendar.getTable();
    }

    @Test(enabled = false)
    public void selectDate() throws NotLoggedInException {

        login();
        timesheets = new Timesheets(driver);
        timesheets.openPage();
        //    Calendar calendar = timesheets.getCalendar();

        System.err.println("NUMBER: " + timesheets.getStartDate());
        timesheets.setStartDate("05/05/2005");
        System.err.println("NUMBER: " + timesheets.getStartDate());


    }

    @Test(enabled = true)
    public void selectWorkItem() throws NotLoggedInException {
        workItem = timesheets.selectWorkItem("");
    }

    @Test(enabled = false,priority = 10)
    public void workItemSwitchTabs() throws NotLoggedInException {
        pause(3);
        workItem.switchToBrowse();
        pause(3);
        workItem.switchToMyWorks();
        pause(3);
        workItem.switchToFavourites();
        pause(3);
        workItem.switchToSearch();
        pause(3);
    }

    @Test(enabled = true,priority = 20)
    @Parameters("projectName")
    public void selectWorkItemInMyWorks(String projectName){
        workItem.switchToBrowse();
        pause(3);
        workItem.switchToMyWorks();
        pause(3);
        workItem.selectWorkItem(projectName);
        pause(3);
    }


}
