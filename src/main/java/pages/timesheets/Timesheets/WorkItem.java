package pages.timesheets.Timesheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.timesheets.WorkItemLoc.*;

/**
 * Select Work item dialog window
 * 4 tabs should be displayed by default
 */
public class WorkItem extends Page {

    public WorkItem(WebDriver driver) {
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

    public void switchToMyWorks() {
        log("Switch to MY WORK");
        driver.findElement(By.xpath(MY_WORK_TAB.getLocator())).click();
    }

    public void switchToFavourites() {
        log("Switch to FAVOURITES");
        driver.findElement(By.xpath(FAVOURITES_TAB.getLocator())).click();
    }

    public void switchToBrowse() {
        log("Switch to BROWSE");
        driver.findElement(By.xpath(BROWSE_TAB.getLocator())).click();
    }

    public void switchToSearch() {
        log("Switch to SEARCH");
        driver.findElement(By.xpath(SEARCH_TAB.getLocator())).click();
    }

    // Select work item

    public void selectWorkItem(String workItem) {
        log("Select [" + workItem + "] work item");
        driver.findElement(By.xpath(WORK_ITEM_NAME.getLocator(workItem))).click();
    }


}
