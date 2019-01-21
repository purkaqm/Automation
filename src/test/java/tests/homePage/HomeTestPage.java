package tests.homePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LeftPanel;
import pages.dashboard.DashGrid;
import pages.exception.NotLoggedInException;
import tests.TestPage;

import static org.testng.Assert.assertTrue;

public class HomeTestPage extends TestPage {


    @Test(enabled = false)
    public void testHomePageOpens() throws NotLoggedInException {

        login();
        assertTrue(new HomePage(driver).openPage());

    }

    @Test(enabled = false)
    public void testLeftPanelCommon() throws NotLoggedInException {

        login();
        LeftPanel leftPanel = new LeftPanel(driver);
        LeftPanel.LeftPanelItems[] items = LeftPanel.LeftPanelItems.values();

        for (LeftPanel.LeftPanelItems item : items) {
            leftPanel.hoverHome(item);
            pause(1);
        }
    }

    @Test
    public void openDashboardFromLeftPanel() throws NotLoggedInException {
        login();
        LeftPanel leftPanel = new LeftPanel(driver);
        DashGrid dashGrid = leftPanel.openDashboard();
        Assert.assertTrue(dashGrid.pageTitle().contains("Dashboard"));
    }
}
