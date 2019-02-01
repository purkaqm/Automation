package utils.seleniumObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableObject extends widgets.WidgetObject implements widgets.WidgetAble {

    public TableObject(WebDriver driver) {
        super(driver);
        System.out.println("Table object is initialized");
    }

    @Override
    public void getTable() {

        System.out.println("getTable method is running...\n");
        WebElement table = driver.findElement(By.id("customers"));

        List<WebElement> rows = table.findElements(By.xpath(".//tr"));

        System.err.println("Rows SIZE = " + rows.size());
        System.err.println(rows.get(1).getText());

    }
}
