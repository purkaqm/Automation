package tests.dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dashboard.layouts.Step1;
import pages.exception.NotLoggedInException;
import tests.PageTest;

import pages.dashboard.layouts.DashLayouts;

public class DashLayoutsTest extends PageTest {

    DashLayouts dashLayouts;

    @Test
    public void openDashboardLayoutsGrid() throws NotLoggedInException {
        Assert.assertTrue(openLayoutsGrid());
    }

    @Test
    public void ClickOnAddNewButton() throws NotLoggedInException {
        openDashboardLayoutsGrid();
        Step1 step1 = dashLayouts.AddNewBtn();
        Assert.assertTrue(step1.openPage(), "Step 1 page is NOT opened");
    }

    protected boolean openLayoutsGrid() throws NotLoggedInException {
        login();
        dashLayouts = new DashLayouts(driver);
        return dashLayouts.openPage();
    }
}
