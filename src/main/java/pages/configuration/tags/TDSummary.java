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
        //driver.findElement(By.xpath())


        return this;
    }
}
