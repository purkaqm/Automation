package tests.dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dashboard.layouts.Step1;
import pages.exception.NotLoggedInException;

public class DashLayoutStepsTestPage extends DashLayoutsTestPage {

    @Test
    public void testStep1() throws NotLoggedInException {
        // open Layouts Grid
        openLayoutsGrid();
        // click on Add New button >> Step1 should be opened
        Step1 step1 = dashLayouts.addNewBtn();
        Assert.assertTrue(step1.openPage());
    }
}
