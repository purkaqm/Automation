package pages.timesheets;


import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class TimesheetsEdit extends Page{
    public TimesheetsEdit(WebDriver driver) {
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
}
