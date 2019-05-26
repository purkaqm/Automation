package pages.timesheets.Timesheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Page;
import pages.exception.NotLoggedInException;
import widgets.Calendar;

import static locators.timesheets.TimesheetsLoc.*;
import static locators.CommonLoc.*;

public class Timesheets extends Page {


    WorkItem workItem;

    public Timesheets(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {

        return driver.getTitle();
    }


    // Open Profile >> TimesheetsLoc
    @Override
    public boolean openPage() throws NotLoggedInException {
        log("Open User menu");
        driver.findElement(By.xpath(USER_PROFILE_MENU.getLocator())).click();
        log("Click on TimesheetsLoc URL");
        driver.findElement(By.xpath(USER_PROFILE_MENU_TIMESHEETS.getLocator())).click();
        pageTitle();
        log("Getting title");

        return driver.getTitle().contains("Timesheets");
    }

    public boolean openProfile(String userID, boolean isNew) throws NotLoggedInException {
        String currentProfile = isNew ? (context + TIMESHEET_PROFILE.getLocator2(userID)) :
                (context + TIMESHEET_PROFILE.getLocator(userID));

        log("Open profile: " + currentProfile);
        driver.get(currentProfile);
        return driver.getTitle().contains("Profile");
    }

    public Calendar getCalendar() {
        log("Click on Calendar widget");
        driver.findElement(By.xpath(CALENDAR_BTN.getLocator())).click();
        return new Calendar(driver, CALENDAR_WGT);
    }

    public String getStartDate() {
        return driver.findElement(By.xpath(START_DATE_FIELD.getLocator())).getAttribute("value");
    }

    public String getEndDate() {
        return driver.findElement(By.xpath(END_DATE_FIELD.getLocator())).getText();
    }

    public void setStartDate(String date) {

    }

    public void setEndDate(String date) {

    }

    public WorkItem selectWorkItem(String workItemName) {
        // Find any empty work item field

        log("click on SELECT work");
        driver.findElement(By.xpath(SELECT_EMPTY_WORK.getLocator())).click();
        workItem = new WorkItem(driver);
        return workItem;
    }
}
