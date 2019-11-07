package tests.project;

import objects.project.Project;
import objects.project.ProjectEditDetails;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class ProjectEditDetailsTestPage extends TestPage {

    @Parameters({"projectId","startDate"})
    @Test
    public void setPlannedStartDate(String projectId,String startDate) throws NotLoggedInException {

        login();

        Project project = new Project(driver, projectId);
        // open project
        project.openPage();
        // open edit details page
        ProjectEditDetails edit = project.openEditDetails();

        // edit schedule and enter planned start date

        edit.editSchedule().setPlannedStartDate(startDate).saveChanges();
        // Save All
        edit.saveChanges();


    }
}
