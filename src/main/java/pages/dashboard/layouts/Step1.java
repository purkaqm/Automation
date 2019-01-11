package pages.dashboard.layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

import static locators.dashboard.layouts.Step1.*;

public class Step1 extends DashLayouts {

    private String layoutName = "New Layout";
    private String description = "";

    public Step1(WebDriver driver) {
        super(driver);
    }

    public String getLayoutName() {
        return layoutName;
    }

    @Override
    //Create a New Layout
    public boolean openPage() throws NotLoggedInException {
        return driver.getTitle().contains(layoutName);
    }

    //Open Existing layout
    public boolean openPage(String layoutName) {
        this.layoutName = layoutName;
        return driver.getTitle().contains(layoutName);
    }

    //Create a copy of an Existing layout
    public boolean openPage(String layoutName, boolean copy) {
        this.layoutName = layoutName + " - Copy";
        return driver.getTitle().contains(layoutName);
    }

    public Step2 continueBtn() {
        driver.findElement(By.xpath(CONTINUE_BTN.getLocator())).click();
        return new Step2(driver);
    }

    public void setLayoutName(String layoutName) {
        driver.findElement(By.xpath(LAYOUT_NAME_FLD.getLocator())).sendKeys(layoutName);
        this.layoutName = layoutName;
    }

    public void setDescription(String description) {
        driver.findElement(By.xpath(DESCRIPTION_FLD.getLocator())).sendKeys(description);
        this.description = description;
    }
}
