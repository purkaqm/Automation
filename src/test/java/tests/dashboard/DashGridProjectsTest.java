package tests.dashboard;


import org.testng.annotations.Test;
import pages.dashboard.DashGridRows;
import pages.exception.NotLoggedInException;

public class DashGridProjectsTest extends DashGridTest {

    @Test
    public void projectColumnsTest() throws NotLoggedInException {
        openGrid();

        new DashGridRows(driver).getProjectRowNumber("GK project");
    }
}
