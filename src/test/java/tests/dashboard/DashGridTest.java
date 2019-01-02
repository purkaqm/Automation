package tests.dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dashboard.DashGrid;
import pages.exception.NotLoggedInException;
import tests.PageTest;

public class DashGridTest extends PageTest {

    DashGrid dashGrid;

    protected void openGrid() throws NotLoggedInException {
        login();
        dashGrid = new DashGrid(driver);
        dashGrid.openPage();
    }


    @Test
    public void testDashGridOpens() throws NotLoggedInException {
        openGrid();
        Assert.assertTrue(dashGrid.openPage());

    }

    @Test
    public void changePortLayout() throws NotLoggedInException {
        String portfolioName = "Ideas";
        String dashlayout = "gk icons";

        openGrid();

        dashGrid.selectPortfolio(portfolioName);
        dashGrid.selectLayout(dashlayout);
        dashGrid.clickGo();
    }

    @Test
    public void changeSecondPOrtfolio() throws NotLoggedInException {
        String secondPortfolio = "Ideas";

        openGrid();

        dashGrid.selectSecondPortfolio(secondPortfolio);
        dashGrid.clickGo();
    }
}
