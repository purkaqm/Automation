package pages.configuration.templates.metrics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static locators.configuration.templates.metrics.TemplateLoc.*;

public class MTBasicInfo extends MTSummary {
    public MTBasicInfo(WebDriver driver) {
        super(driver);
    }

    public MTBasicInfo setName(String name) {
        log("Enter metric template name [" + name + "]");
        driver.findElement(By.xpath(NAME_FLD.getLocator())).sendKeys(name);
        return this;
    }

    public void next() {
        log("Next page");
        driver.findElement(By.xpath(NEXT_BTN.getLocator())).click();
    }

    public MTBasicInfo startDate(String date) {
        log("Enter START date [" + date + "]");
        driver.findElement(By.xpath(START_DATE_FLD.getLocator())).clear();
        driver.findElement(By.xpath(START_DATE_FLD.getLocator())).sendKeys(date);
        return this;
    }
}
