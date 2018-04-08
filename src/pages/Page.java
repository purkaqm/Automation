package pages;

import org.openqa.selenium.WebDriver;


abstract class Page implements PageObject {

    WebDriver driver;


    Page(WebDriver driver) {
        this.driver = driver;


    }

}
