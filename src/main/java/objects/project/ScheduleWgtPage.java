package objects.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.project.ScheduleWgtLoc.*;

public class ScheduleWgtPage extends Page {
    public ScheduleWgtPage(WebDriver driver) {
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

    public ScheduleWgtPage openConstraintTypeMenu() {
        log("Open Constraint Type menu");
        driver.findElement(By.xpath(CONSTRAIN_DD_MENU.getLocator())).click();
        return this;
    }

    public ScheduleWgtPage selectConstraint(String type) {
        log("Select constraint [" + type + "]");
        driver.findElement(By.xpath(TYPE.getLocator(type))).click();

        return this;
    }

    public ScheduleWgtPage setPlannedStartDate(String date) {

        log("Enter Planned Start Date [" + date + "]");
        driver.findElement(By.xpath(PLANNED_START_DATE.getLocator())).clear();
        pause(4);
        driver.findElement(By.xpath(PLANNED_START_DATE.getLocator())).sendKeys(date);

        return this;
    }

    public ScheduleWgtPage setPlannedEndDate(String date) {

        log("Enter Planned End Date [" + date + "]");
        driver.findElement(By.xpath(PLANNED_END_DATE.getLocator())).clear();
        driver.findElement(By.xpath(PLANNED_END_DATE.getLocator())).sendKeys(date);

        return this;
    }

    public void saveChanges() {
        log("Save changes");
        driver.findElement(By.xpath(SAVE_BTN.getLocator())).click();
    }
}
