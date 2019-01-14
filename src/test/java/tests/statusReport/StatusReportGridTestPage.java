package tests.statusReport;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import pages.statusReport.DedicatedSR;
import tests.TestPage;

public class StatusReportGridTestPage extends TestPage {

    @Parameters({"projectName", "projectID"})
    @Test
    public void testSRDedicatedGrid(String projectName, String projectID) throws NotLoggedInException {
        // open context
        login();

        // open Project's Status report dedicated page
        DedicatedSR dedicatedSR = new DedicatedSR(driver, projectName, projectID);
        Assert.assertTrue(dedicatedSR.openPage());


    }

}
