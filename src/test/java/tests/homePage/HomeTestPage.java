package tests.homePage;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LeftPanel;
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
        LeftPanel.LeftPanelAreas[] items = LeftPanel.LeftPanelAreas.values();

        for (LeftPanel.LeftPanelAreas item : items) {
            System.out.println(item);
            leftPanel.hoverHome(item);
            pause(1);
        }
    }

    @Test
    public void openDashboardFromLeftPanel() throws NotLoggedInException {
        login();
        LeftPanel leftPanel = new LeftPanel(driver);
        leftPanel.openDashboard();
        pause(3);
        leftPanel.hoverHome(LeftPanel.LeftPanelAreas.ADMIN);

    }
}
