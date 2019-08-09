package pages.configuration.templates.metrics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.templates.metrics.GridLoc.*;

public class Grid extends Page {

    WebDriver frame;

    public Grid(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        log("Open Metric Templates Grid");
        driver.get(context + METRIC_TEMPLATES_GRID_URL.getLocator());
        log("Switch to iFrame and create a new WebDriver");
        frame = driver.switchTo().frame(0);
        return false;
    }

    public MTBasicInfo createNew() throws NotLoggedInException {
        openPage();
        frame.findElement(By.xpath(ADD_NEW_BTN.getLocator())).click();
        return new MTBasicInfo(driver);
    }

}
