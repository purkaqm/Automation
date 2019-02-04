package widgets;

import locators.LocatorAble;
import org.openqa.selenium.WebElement;

public interface WidgetAble {

    WebElement getTableItem(LocatorAble locator, String element);

    void getTable();
}
