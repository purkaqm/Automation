package pages.statusReport;


import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class DedicatedPage extends Page {

    public DedicatedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return driver.getTitle();
    }

    @Override
    public boolean pageIsOpened() throws NotLoggedInException {
        driver.get(context + "");
        return false;
    }
}
