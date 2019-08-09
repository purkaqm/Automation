package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.project.Project.*;

public class Project extends Page {


    private String projectName = null;
    private String projectID = null;

    public Project(WebDriver driver) {
        super(driver);
    }

    public Project(WebDriver driver, String projectID) {
        super(driver);
        this.projectID = projectID;
    }


    public String getProjectName() {


        projectName = driver.findElement(By.xpath(PROJECT_TITLE_FLD.getLocator())).getText();
        log("Project name is [" + projectName + "]");

        return projectName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectName(String projectName) {
        this.projectName = this.projectName;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }


    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        openProjectByID(projectID);
        return false;
    }

    public void openProjectByName(String projecName) {

    }

    public void openProjectByID(String projectID) {

        this.projectID = projectID;

        log("Open project by id [" + projectID + "]");
        driver.get(context + PROJECT_SUMMARY.getLocator() + projectID);

    }

    public ScheduleWgtPage openScheduleWgt() {
        driver.findElement(By.xpath(EDIT_BTN.getLocator(SCHEDULE_WGT.getLocator()))).click();
        return new ScheduleWgtPage(driver);
    }

    public void openConfigurationWgt() {
        driver.findElement(By.xpath(EDIT_BTN.getLocator(CONFIGURATION_WGT.getLocator()))).click();

    }
}
