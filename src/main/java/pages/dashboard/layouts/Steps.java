package pages.dashboard.layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static locators.dashboard.layouts.StepsLoc.*;

class Steps extends DashLayouts {

    String layoutName = "New Layout";

    public Steps(WebDriver driver) {
        super(driver);
    }


    public DashLayouts saveAndFinish() {
        driver.findElement(By.xpath(SAVE_AND_FINISH_BTN.getLocator())).click();
        return new DashLayouts(driver);
    }

    public DashLayouts cancel() {
        driver.findElement(By.xpath(CANCEL_BTN.getLocator())).click();
        return new DashLayouts(driver);
    }

    public void continueBtn(){
        driver.findElement(By.xpath(CONTINUE_BTN.getLocator())).click();
    }

}

