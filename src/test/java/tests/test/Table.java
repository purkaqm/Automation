package tests.test;

import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import pages.timesheets.Timesheets;
import tests.TestPage;

public class Table extends TestPage {

    @Test
    public void testTable() throws NotLoggedInException {

        setMainURL("https://devxl.psteering.com/pristine_192_273178");
        login();
        Timesheets timesheets = new Timesheets(driver);
        timesheets.openPage();
    }
}
