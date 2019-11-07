package tests.project;

import objects.project.Project;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NoMSTeamsException;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class MSTeamsTestPage extends TestPage {

    Project project;

    @Parameters({"projectId"})
    @Test
    public void createMSTeams(String projectId) throws NotLoggedInException, NoMSTeamsException {
        login();
        project = new Project(driver);
        project.openProjectByID(projectId);
        project.openMSTeams();
    }
}
