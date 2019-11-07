package tests.project;

import objects.project.Project;
import objects.project.ScheduleWgtPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class ScheduleWgtTestPage extends TestPage {

    Project project;


    @Parameters({"projectId"})
    @Test(enabled = false)
    public void testOpenConstraintMenu(String projectId) throws NotLoggedInException {
        login();

        project = new Project(driver, projectId);
        // open project
        project.openPage();
        // open Schedule widget
        ScheduleWgtPage schedule = project.openScheduleWgt();
        // open constraint menu
        schedule.openConstraintTypeMenu().
                selectConstraint("Must Start On").
                setPlannedStartDate("10/10/2019").
                saveChanges();
        pause(3);

    }
}
