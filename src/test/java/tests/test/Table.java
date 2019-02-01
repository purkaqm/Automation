package tests.test;

import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import pages.timesheets.Timesheets;
import tests.TestPage;
import widgets.Calendar;

public class Table extends TestPage {

    @Test
    public void testTable() throws NotLoggedInException {

        pause(1);
        setMainURL("https://devxl.psteering.com/pristine_192_273178/");
        login();
        Timesheets timesheets = new Timesheets(driver);
        timesheets.openProfile("18u12a80000m0hahpbqg000000");
        Calendar calendar = timesheets.getCalendar();

        calendar.getTable();

    }
}
