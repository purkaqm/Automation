package tests.dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dashboard.DashGrid;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class DashGridTestPage extends TestPage {

    protected DashGrid dashGrid;

// Review Dashboard page opens
    @Test
    public void testDashGridOpens() throws NotLoggedInException {
        openGrid();
        Assert.assertTrue(dashGrid.openPage());

    }
// Portfolio + layout can be changed
    @Test
    public void changePortLayout() throws NotLoggedInException {
        String portfolioName = "Ideas";
        String dashlayout = "gk icons";

        openGrid();

        dashGrid.selectPortfolio(portfolioName);
        dashGrid.selectLayout(dashlayout);
        dashGrid.clickGo();
    }
// Second (Split) portfolio can be selected
    @Test
    public void changeSecondPOrtfolio() throws NotLoggedInException {
        String secondPortfolio = "Ideas";

        openGrid();

        dashGrid.selectSecondPortfolio(secondPortfolio);
        dashGrid.clickGo();
    }


    protected void openGrid() throws NotLoggedInException {
        login();
        dashGrid = new DashGrid(driver);
        dashGrid.openPage();
    }
}
