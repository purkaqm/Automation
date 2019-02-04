package widgets;

import locators.LocatorAble;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExportList extends WidgetObject{
    public ExportList(WebDriver driver) {
        super(driver);
    }


    @Override
    public WebElement getTableItem(LocatorAble locator, String element) {
        return null;
    }

    @Override
    public void getTable() {

    }
}
