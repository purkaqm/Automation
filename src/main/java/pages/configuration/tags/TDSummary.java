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


    public TDSummary tagUnder(String sourceTagValue, String targetTag, String targetTagValue) {

        if (sourceTagValue.equals("Top")) {

            tagTop(targetTag, targetTagValue);

            selectTagValue(targetTagValue);

            submit();
            return this;
        } else {

            log("Select tag [" + sourceTagValue + "] from the menu");
            openMenu(sourceTagValue);

            log("select new target tag [" + targetTag + "]");
            selectTagMenu(targetTag);

            selectTagValue(targetTagValue);

            submit();

            return this;
        }
    }

    private TDSummary tagTop(String targetTag, String targetTagValue) {
        log("Select tag [Top] from the menu");
        openMenu("Top");

        log("select new target tag [" + targetTag + "]");
        selectTopTagMenu(targetTag);


        return this;
    }

    private void openMenu(String sourceTagValue) {
        driver.findElement(By.xpath(SOURCE_TAG_MENU.getLocator(sourceTagValue))).click();
    }

    private void selectTagMenu(String tagSetName) {
        driver.findElement(By.xpath(TARGET_TAG.getLocator(tagSetName))).click();

    }

    private void selectTopTagMenu(String tagSetName) {
        driver.findElement(By.xpath(TARGET_TAG_TOP.getLocator(tagSetName))).click();

    }

    private void selectTagValue(String tagValue) {


        log("Open Tag value menu");
        driver.findElement(By.xpath(TAG_VALUE_MENU.getLocator())).click();

        log("Select value [" + tagValue + "]");
        driver.findElement(By.xpath(TAG_VALUE.getLocator(tagValue))).click();

        log("Click DONE");
        driver.findElement(By.xpath(DONE_BTN.getLocator())).click();

    }

    private void submit() {
        driver.findElement(By.xpath(SUBMIT_BTN.getLocator())).click();


    }

}
