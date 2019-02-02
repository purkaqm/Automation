package objects;

import org.openqa.selenium.WebDriver;

public class Project {

    private WebDriver webDriver;

    private String projecName = null;
    private String projectID = null;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public String getProjecName() {
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

    public Project(WebDriver webDriver) {
        this.webDriver = webDriver;

    }
}
