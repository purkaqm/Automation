package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.logging.Logger;

import java.io.File;
import java.io.IOException;

import static locators.CommonLoc.*;

abstract public class Page implements PageObject {

    protected String context = CONTEXT_URL.getLocator();

    protected WebDriver driver;

    protected static boolean loggedIn = false;


    public Page(WebDriver driver) {
        this.driver = driver;
        System.out.println("CONTEXT ================ " + CONTEXT_URL.getLocator());


    }

    protected Page() {
    }


    // Take screenshot
    public void takeScreenshot(String fileName) {
        File src;
        src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("out\\production\\screenshots\\" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pause(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void log(String string) {
        new Logger(1).log(string);
    }

}
