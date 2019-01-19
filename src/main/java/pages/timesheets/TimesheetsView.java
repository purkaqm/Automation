package pages.timesheets;

import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.timesheets.TimesheetsViewLoc.*;

public class TimesheetsView extends Page {
    public TimesheetsView(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }


    // Open Profile >> Timesheets
    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }

    public boolean openProfile(String userID) throws NotLoggedInException {
        driver.get(context + TIMESHEET_PROFILE.getLocator(userID));
        return driver.getTitle().contains("Profile");
    }
}
