package pages;

import org.openqa.selenium.WebDriver;

import static locators.CommonLoc.*;

abstract public class Page implements PageObject {

    protected String context = CONTEXT_URL.getLocator();

    protected WebDriver driver;


    public Page(WebDriver driver) {
        this.driver = driver;


    }

}