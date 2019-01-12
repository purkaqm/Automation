package pages.dashboard.layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static locators.dashboard.layouts.StepsLoc.CANCEL_BTN;
import static locators.dashboard.layouts.StepsLoc.CONTINUE_BTN;
import static locators.dashboard.layouts.StepsLoc.SAVE_AND_FINISH_BTN;

class Steps extends DashLayouts {
    String layoutName = "New Layout";

    Steps(WebDriver driver) {
        super(driver);
    }

    public Steps continueBtn() {
        driver.findElement(By.xpath(CONTINUE_BTN.getLocator())).click();
        return new Steps(driver);
    }

    public DashLayouts saveAndFinish() {
        driver.findElement(By.xpath(SAVE_AND_FINISH_BTN.getLocator())).click();
        return new DashLayouts(driver);
    }

    public DashLayouts cancel() {
        driver.findElement(By.xpath(CANCEL_BTN.getLocator())).click();
        return new DashLayouts(driver);
    }

}

