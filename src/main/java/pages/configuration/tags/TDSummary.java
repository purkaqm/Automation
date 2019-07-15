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

        log("Select tag [" + sourceTagValue + "] from the menu");
        openMenu(sourceTagValue);

        log("select new target tag [" + targetTag + "]");
        selectTagMenu(targetTag);

        pause(5);


        return this;
    }

    private void openMenu(String sourceTagValue) {
        driver.findElement(By.xpath(SOURCE_TAG_MENU.getLocator(sourceTagValue))).click();
    }

    private void selectTagMenu(String tagSetName) {
        driver.findElement(By.xpath(TARGET_TAG.getLocator(tagSetName))).click();

    }

    private void selectTagValue(String tagValue) {
        driver.findElement(By.xpath("")).click();
    }


    public void directEntering() {
        driver.findElement(By.xpath("//a[contains(text(),'Top')]")).click();

        driver.findElement(By.xpath("//select[@id='rsel']//option[text()='tag001']")).click();
        pause(4);


    }
}
