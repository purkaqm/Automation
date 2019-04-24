package pages.timesheets;

import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

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

    public void selectMyWork() {
    }

    public void selectFavourites() {
    }

    public void selectBrowse() {
    }

    public void selectSearch() {
    }


}
