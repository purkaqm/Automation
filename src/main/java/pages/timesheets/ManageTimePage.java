package pages.timesheets;

import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class ManageTimePage extends Page {

    public ManageTimePage(WebDriver driver) {
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

    public void changeWeek(){

    }

    public String getCosts(String lineItem){
        return "";
    }
}
