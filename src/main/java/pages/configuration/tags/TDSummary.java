package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TDListPageLoc.*;

public class TDSummary extends Page {
    public TDSummary(WebDriver driver) {
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

    public TDSummary selectRoot(String targetTag, String targetTagValue) {
        tagUnder("Top", targetTag, targetTagValue);
        return this;
    }

    public TDSummary tagUnder(String sourceTagValue, String targetTag, String targetTagValue) {

        log("Click on TOP menu");
        pause(3);
       driver.findElement(By.xpath(SOURCE_TAG_MENU.getSourceTagMenu(sourceTagValue))).click();
       pause(3);

        log("Select Source tag > Target Tag set == "+TARGET_TAG.getTargetTag(sourceTagValue, targetTag));
        driver.findElement(By.xpath(TARGET_TAG.getTargetTag(sourceTagValue, targetTag))).click();
        log("Select values");
        pause(3);


        return this;
    }

    public void directEntering(){
        driver.findElement(By.xpath("//a[contains(text(),'Top')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Top')]//following::select[1]//option[contains(text(),'tag001')]")).click();





    }
}
