package objects.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NoMSTeamsException;
import pages.exception.NotLoggedInException;

import static locators.project.ProjectLoc.*;

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
        log("ProjectLoc name is [" + projectName + "]");

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

    public ProjectEditDetails openEditDetails() {
        driver.findElement(By.xpath(EDIT_DETAILS_BTN.getLocator())).click();
        return new ProjectEditDetails(driver);
    }

    public ScheduleWgtPage openScheduleWgt() {
        driver.findElement(By.xpath(EDIT_BTN.getLocator(SCHEDULE_WGT.getLocator()))).click();
        return new ScheduleWgtPage(driver);
    }

    public void openConfigurationWgt() {
        driver.findElement(By.xpath(EDIT_BTN.getLocator(CONFIGURATION_WGT.getLocator()))).click();

    }

    public MSTeams openMSTeams() throws NotLoggedInException, NoMSTeamsException {
   //     openPage();
        checkMSTeams();

        log("Click on MS Teams button");

               driver.findElement(By.xpath(MSTEAMS_BTN.getLocator())).click();

        return new MSTeams(driver);
    }

    boolean checkMSTeams() throws NoMSTeamsException {
        try {
            driver.findElement(By.xpath(MSTEAMS_BTN.getLocator())).isDisplayed();
        } catch (Exception e) {
            throw new NoMSTeamsException("MS teams button is NOT found!");
        }
        return true;
    }

    public OwnerShipDialog setOwnerShip(String owner){
        return new OwnerShipDialog(owner);
    }
}
