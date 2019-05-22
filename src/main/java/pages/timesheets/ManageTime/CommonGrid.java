package pages.timesheets.ManageTime;

import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class CommonGrid extends Page {

    public CommonGrid(WebDriver driver) {
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

    public void changeWeek() {

    }

    public String getCosts(String lineItem) {
        return "";
    }

    public String getResourcePool(String lineItem) {
        return "";
    }

    public String getTagValue(String tagName, String lineItem) {
        return "";
    }
}
