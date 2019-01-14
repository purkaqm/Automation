package pages.dashboard.layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.exception.NotLoggedInException;

import static locators.dashboard.layouts.Step1_Loc.*;

public class Step1 extends Steps implements NextPage {

    private String description = "";

     Step1(WebDriver driver) {
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

    public void setLayoutName(String layoutName) {
        WebElement nameField = driver.findElement(By.xpath(LAYOUT_NAME_FLD.getLocator()));

        nameField.clear();
        nameField.sendKeys(layoutName);

        this.layoutName = layoutName;
    }

    public void setDescription(String description) {
        driver.findElement(By.xpath(DESCRIPTION_FLD.getLocator())).sendKeys(description);
        this.description = description;
    }

    public NextPage next() {
        continueBtn();
        return new Step2(driver);
    }
}


