package utils.seleniumObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableObject extends widgets.WidgetObject implements widgets.WidgetAble {

    public TableObject(WebDriver driver) {
        super(driver);
        System.out.println("Table object is initialized");
    }

    @Override
    public void getTable() {

        System.out.println("getTable method is running...");
        WebElement table = driver.findElement(By.id("customers"));

        System.err.println("Tag name is " + table.getTagName());
        System.err.println(table.getSize().getWidth());

    }
}
