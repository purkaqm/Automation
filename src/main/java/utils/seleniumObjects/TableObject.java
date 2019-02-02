package utils.seleniumObjects;

import locators.LocatorAble;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableObject extends widgets.WidgetObject {

    public TableObject(WebDriver driver) {
        super(driver);
    }

    @Override
    public void getTable() {


        WebElement table =
                driver.findElement(By.xpath("//table[@id='customers']"));
        List<WebElement> rows = table.findElements(By.cssSelector("tr"));

        System.out.println("Rows ===== " + rows.size());

        for (int i = 0; i < rows.size(); i++) {
            // System.out.println(rows.get(i).getText());

            List<WebElement> cells = rows.get(i).findElements(By.xpath("./*"));

            System.out.println(cells.size());

        }

    }

    @Override
    public void getTable(WebElement element) {

    }

    @Override
    public void getTable(LocatorAble locator) {

    }
}
