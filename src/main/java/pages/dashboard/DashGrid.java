package pages.dashboard;


import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class DashGrid extends Page {
    public DashGrid(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean pageIsOpened() throws NotLoggedInException {
        driver.get(context + "");
        return driver.getTitle().contains("Dashboard");
    }
}
