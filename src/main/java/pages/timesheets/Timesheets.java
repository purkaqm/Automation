package pages.timesheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Page;
import pages.exception.NotLoggedInException;
import widgets.Calendar;

import static locators.timesheets.TimesheetsLoc.*;
import static locators.CommonLoc.*;

public class Timesheets extends Page {
    public Timesheets(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        System.out.println(driver.getTitle());
        return "";
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

        return driver.getTitle().contains("TimesheetsLoc");
    }

    public boolean openProfile(String userID) throws NotLoggedInException {
        log("Open profile: " + TIMESHEET_PROFILE.getLocator(userID));
        driver.get(context + TIMESHEET_PROFILE.getLocator(userID));
        return driver.getTitle().contains("Profile");
    }

    public Calendar getCalendar() {
        log("Click on Calendar widget");
        driver.findElement(By.xpath(CALENDAR_BTN.getLocator())).click();
        return new Calendar(driver, CALENDAR_WGT);
    }
}
