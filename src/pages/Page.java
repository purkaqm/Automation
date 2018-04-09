package pages;

import org.openqa.selenium.WebDriver;

import static locators.CommonLoc.*;

abstract class Page implements PageObject {

    String context = CONTEXT_URL.getLocator();

    WebDriver driver;


    Page(WebDriver driver) {
        this.driver = driver;


    }

}
