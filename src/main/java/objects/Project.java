package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.project.Project.*;

public class Project extends Page {


    private String projecName = null;
    private String projectID = null;

    public Project(WebDriver driver) {
        super(driver);
    }


    public String getProjecName() {


        projecName = driver.findElement(By.xpath(PROJECT_TITLE_FLD.getLocator())).getText();
        log("Project name is [" + projecName + "]");

        return projecName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjecName(String projecName) {
        this.projecName = projecName;
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
        return false;
    }

    public void openProjectByName(String projecName) {

    }

    public void openProjectByID(String projectID) {

        this.projectID = projectID;

        log("Open project by id [" + projectID + "]");
        driver.get(context + PROJECT_SUMMARY.getLocator() + projectID);

    }
}
