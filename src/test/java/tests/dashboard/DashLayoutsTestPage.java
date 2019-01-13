package tests.dashboard;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.dashboard.layouts.Step1;
import pages.dashboard.layouts.Step2;
import pages.exception.NotLoggedInException;
import tests.TestPage;

import pages.dashboard.layouts.DashLayouts;

public class DashLayoutsTestPage extends TestPage {

    DashLayouts dashLayouts;
    Step1 step1;
    Step2 step2;

    @Test
    public void openDashboardLayoutsGrid() throws NotLoggedInException {
        Assert.assertTrue(openLayoutsGrid());
    }

    @Test
    public void ClickOnAddNewButton() throws NotLoggedInException {
        openDashboardLayoutsGrid();
        step1 = dashLayouts.addNewBtn();
        Assert.assertTrue(step1.openPage(), "Step 1 page is NOT opened");
    }

     boolean openLayoutsGrid() throws NotLoggedInException {
        login();
        dashLayouts = new DashLayouts(driver);
        return dashLayouts.openPage();
    }

    @Parameters({"layoutName","description"})
    @Test
    public void createNewLayout(String layoutName, String description) throws NotLoggedInException {

        //  open Dashboard layouts grid
        openLayoutsGrid();
        // click on [Add New] button
        step1 = dashLayouts.addNewBtn();
        // Enter layout's name
        step1.setLayoutName(layoutName);
        // Enter description
        step1.setDescription(description);
        // click on [Continue] button

        Step2 step2 = (Step2) step1.next();

        step2.addCustomField("");

    }
}
