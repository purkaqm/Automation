package tests.configuration.tags;


import objects.project.Project;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class PS_20344 extends TestPage {

    Project project;

    @Parameters({"projectID", "tagGroup"})
    @Test(enabled = true)
    public void testPS_20344(String projectID, String tagGroup) throws NotLoggedInException {
        login();
        project = new Project(driver);
        project.openProjectByID(projectID);
        // get project name
        project.getProjectName();
    }
}
