package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Page;
import pages.exception.NotLoggedInException;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static locators.configuration.tags.TagUpdate.*;

public class TagUpdate extends Page {
    public TagUpdate(WebDriver driver) {
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

    public TagUpdate changeValues(String[] values) {
        log("Create a list of SEQ fields");
        List<WebElement> seqElements = driver.findElements(By.xpath(SEQ_FLD.getLocator()));
        log("Create a list of NAME fields");
        List<WebElement> nameElements = driver.findElements(By.xpath(NAME_FLD.getLocator()));

        for (int i = 0; i < values.length - 1; i++) {
            log("Enter SEQ [" + values[i] + "]");
            seqElements.get(i).clear();
            seqElements.get(i).sendKeys(values[i]);

            log("Enter NAME [" + values[i + 1] + "]");
            nameElements.get(i).clear();
            nameElements.get(i).sendKeys(values[i + 1]);
        }


        return this;


    }

    public TagUpdate changeValues(String[][] values) {
        log("Create a list of SEQ fields");
        List<WebElement> seqElements = driver.findElements(By.xpath(SEQ_FLD.getLocator()));
        log("Create a list of NAME fields");
        List<WebElement> nameElements = driver.findElements(By.xpath(NAME_FLD.getLocator()));

        WebElement seq, name;

        for (int i = 0; i < values.length; i++) {

            int j = 0;

            seq = seqElements.get(i);
            seq.clear();
            seq.sendKeys(values[i][j]);

            j++;

            name = nameElements.get(i);
            name.clear();
            name.sendKeys(values[i][j]);
        }

        return this;
    }

    public void applyChanges() {
        driver.findElement(By.xpath(UPDATE_BTN.getLocator())).click();
    }
}
