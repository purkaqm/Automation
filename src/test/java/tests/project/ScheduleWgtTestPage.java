package tests.project;

import objects.Project;
import objects.ScheduleWgtPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class ScheduleWgtTestPage extends TestPage {

    Project project;


    @Parameters({"projectId"})
    @Test
    public void testOpenConstraintMenu(String projectId) throws NotLoggedInException {
        login();

        project = new Project(driver, projectId);
        // open project
        project.openPage();
        // open Schedule widget
        ScheduleWgtPage schedule = project.openScheduleWgt();
        // open constraint menu
        schedule.openConstraintTypeMenu();
        pause(3);


    }
}
