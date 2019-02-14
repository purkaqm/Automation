package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CheckActions {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        chromeDriver.get("http://google.com");

        Actions action = new Actions(chromeDriver);

        WebElement field = chromeDriver.findElement(By.xpath("//input[@name='q']"));

        action.sendKeys(field, "BLABLABLA").perform();
        chromeDriver.close();
    }
}
