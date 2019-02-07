package widgets;

import locators.LocatorAble;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class SelectColumns extends WidgetObject {
    public SelectColumns(WebDriver driver) {
        super(driver);
    }


    @Override
    public String getTableItem(LocatorAble locator, String element) {
        return null;
    }

    @Override
    public void getTable() {


    }
}
