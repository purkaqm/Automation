package pages.dashboard.layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static locators.dashboard.layouts.Step2_Loc.*;

public class Step2 extends Steps implements NextPage {
    public Step2(WebDriver driver) {
        super(driver);
    }

    public void addProjectTag(String projectTagName){

    }
    public void addUserTag(String userTagName){

    }

    public void addCustomField(String cfName){
        System.out.println("ADD CUSTOM FIELD is PRESSED!");
    }

    public void addMeasure(String measureName){

    }

    public void addMetric(String metricName){

    }
    Step1 goToStep1(){
        driver.findElement(By.xpath(CHANGE_STEP1.getLocator())).click();
        return new Step1(driver);
    }

    @Override
    public NextPage next() {
        return null;
    }
}
