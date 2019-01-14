package pages.statusReport;


import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.statusReport.StatusReportGridLoc.*;

public class DedicatedSR extends Page {

    private String projectName;
    private String projectID;

    public DedicatedSR(WebDriver driver, String projectName, String projectID) {
        super(driver);
        this.projectName = projectName;
        this.projectID = projectID;
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        driver.get(context + DEDICATED_GRID_URL.getLocator(projectID));
        // System.out.println(driver.getTitle());
        takeScreenshot("DedicatedSR");
        return driver.getTitle().contains(projectName + " : Status Reports");
    }
}
