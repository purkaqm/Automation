package objects.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.project.ProjectEditDetailsLoc.*;

public class ProjectEditDetails extends Page {
    public ProjectEditDetails(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }

    public ScheduleWgtPage editSchedule() {
        return new ScheduleWgtPage(driver);
    }

    public void saveChanges() {
        driver.findElement(By.xpath(SAVE_ALL_BTN.getLocator())).click();
    }
}
