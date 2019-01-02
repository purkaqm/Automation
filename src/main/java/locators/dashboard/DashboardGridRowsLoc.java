package locators.dashboard;

import locators.LocatorAble;
import org.openqa.selenium.WebElement;

public enum DashboardGridRowsLoc implements LocatorAble {
    PROJECTS_CLM("//div[@sectionid='DashboardMasterSection']//div[@class='projectDiv']"),
    PROJECT_ROW("//div[@sectionid='DashboardMasterSection']//div[@class='projectDiv']/a[text()='" + SS + "']"),
    PROJECT_ROWS("//div[@sectionid='DashboardMasterSection']//div[@class='projectDiv']/a");

    String locator;

    DashboardGridRowsLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

}
