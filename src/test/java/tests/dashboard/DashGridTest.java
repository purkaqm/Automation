package tests.dashboard;

import pages.dashboard.DashGrid;
import pages.exception.NotLoggedInException;
import tests.PageTest;

public class DashGridTest extends PageTest {


    public void testDashGridOpens() throws NotLoggedInException {
        DashGrid dashGrid = new DashGrid(driver);
        dashGrid.pageIsOpened();

    }
}
