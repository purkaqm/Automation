package pages.timesheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.timesheets.TimesheetsViewLoc.*;
import static locators.CommonLoc.*;

public class TimesheetsView extends Page {
    public TimesheetsView(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        System.out.println(driver.getTitle());
        return "";
    }


    // Open Profile >> Timesheets
    @Override
    public boolean openPage() throws NotLoggedInException {
        // Open User menu
        driver.findElement(By.xpath(USER_PROFILE_MENU.getLocator())).click();
        // Click on Timesheets URL
        driver.findElement(By.xpath(USER_PROFILE_MENU_TIMESHEETS.getLocator())).click();
        pageTitle();

        return driver.getTitle().contains("Timesheets");
    }

    public boolean openProfile(String userID) throws NotLoggedInException {
        driver.get(context + TIMESHEET_PROFILE.getLocator(userID));
        return driver.getTitle().contains("Profile");
    }
}
