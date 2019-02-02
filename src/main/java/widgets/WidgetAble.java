package widgets;

import locators.LocatorAble;
import org.openqa.selenium.WebElement;

public interface WidgetAble {

    void getTable();

    void getTable(WebElement element);

    void getTable(LocatorAble locator);
}
