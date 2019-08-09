package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.project.ScheduleWgt.*;

public class ScheduleWgtPage extends Page{
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

    public void openConstraintTypeMenu(){
        log("Open Constraint Type menu");
        driver.findElement(By.xpath(CONSTRAIN_DD_MENU.getLocator())).click();
    }
}
