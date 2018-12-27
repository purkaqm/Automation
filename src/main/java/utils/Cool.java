package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.exception.NotLoggedInException;

import java.util.concurrent.TimeUnit;

public class Cool {

    public static ChromeDriver driver;

    // Инициализация вебдрайвера
    // ChromeDriver

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        // headless driver - browser should not be launched

        driver = new ChromeDriver(new ChromeOptions().setHeadless(true));

        // Время ожидания элемента

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Открываем контекст

        //  driver.get(CONTEXT_URL.getLocator());
    }


    public static void tearDown() {
        driver.close();
    }

    public static void click() throws NotLoggedInException {

        driver.get("http://xn----7sbaf6bff6be2c7c6ah.xn--p1ai/v-obraze-literaturnogo-geroya.html#prettyPhoto");

        System.out.println("Page opens");

        WebElement element = driver.findElement(By.xpath("//label[@for='ans44']"));

        System.out.println(element.getTagName());
        element.click();

        WebElement button = driver.findElement(By.xpath("//div[@class='plg-button']/strong"));

        // System.out.println("Кнопка ответить есть - "+button.isDisplayed());

        button.click();
        System.out.println("Finish");
    }


    public static void main(String[] args) throws NotLoggedInException {

        for (int i = 1; i <= 100; i++) {
            setUp();
            click();
            tearDown();
            System.out.println("Попытка номер: " + i);
        }

    }

}
