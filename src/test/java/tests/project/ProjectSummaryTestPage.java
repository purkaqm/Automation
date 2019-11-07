package tests.project;

import objects.project.Project;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class ProjectSummaryTestPage extends TestPage {

    Project project;

    @Parameters({"projectId"})
    @Test(enabled = false)
    public void openScheduleWidget(String projectId) throws NotLoggedInException {
        login();
        project = new Project(driver);
        // open project
        project.openProjectByID(projectId);
        // open Schedule Widget
        project.openScheduleWgt();

    }

    @Parameters({"projectId"})
    @Test(enabled = false)
    public void openConfigurationWidget(String projectId) throws NotLoggedInException {
        login();
        project = new Project(driver,projectId);
        // open project
        project.openPage();
        // open Schedule Widget
        project.openConfigurationWgt();
    }
}
