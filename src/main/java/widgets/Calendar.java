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

    public void getTable() {
        WebElement table =
                driver.findElement(By.xpath(calendar.getLocator() + "//table"));
        System.err.println(table);
        List<WebElement> rows = table.findElements(By.cssSelector("tr"));

        System.out.println("Rows ===== " + rows.size());


        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath("./*"));

            for (WebElement cell : cells) {
                System.out.print(" | " + cell.getText());
            }
            System.out.println();
        }
    }


    @Override
    public WebElement getTableItem(LocatorAble locator, String element) {
        return null;
    }
}

