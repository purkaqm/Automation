package widgets;

import locators.LocatorAble;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Calendar extends WidgetObject {

    LocatorAble calendar;
    private WebElement table;

    public Calendar(WebDriver driver, LocatorAble calendarWidget) {
        super(driver);
        calendar = calendarWidget;
    }

    public boolean isVisible() {
        return driver.findElement(By.xpath(calendar.getLocator())).isDisplayed();
    }

    @Override
    public void getTable() {
        List<WebElement> rows;
        List<WebElement> cells;


        table = driver.findElement(By.xpath(calendar.getLocator() + "//table"));
        rows = table.findElements(By.xpath("//tr"));
        for (WebElement row : rows) {
            cells = row.findElements(By.xpath("//td"));
            System.out.println("Element: " + cells.get(0));
        }


    }
}
