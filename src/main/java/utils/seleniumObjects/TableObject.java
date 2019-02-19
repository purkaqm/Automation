package utils.seleniumObjects;

import locators.LocatorAble;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableObject extends widgets.WidgetObject {

    public TableObject(WebDriver driver, LocatorAble locator) {
        super(driver);
        this.tableLoc = locator;
    }

    private LocatorAble tableLoc;
    private String element;


    @Override
    public void selectTableItem(String element) {
        this.element = element;
    }

    public void getTable() {


        WebElement table =
                driver.findElement(By.xpath(tableLoc.getLocator()));
        List<WebElement> rows = table.findElements(By.cssSelector("tr"));

        // System.out.println("Rows ===== " + rows.size());

        for (WebElement row : rows) {
         //   System.out.println(row.getText());

            List<WebElement> cells = row.findElements(By.xpath("./*"));
            for (WebElement cell : cells) {
                if (cell.getText().contains(element)) {
                    System.out.println(element + " === " + cell.getText());
                }

            }

        }

    }


}
