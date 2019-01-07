package pages.dashboard.layouts;

import org.openqa.selenium.WebDriver;
import pages.exception.NotLoggedInException;

public class Step1 extends DashLayouts {

    String layoutName = "New Layout";

    public Step1(WebDriver driver) {
        super(driver);
    }

    public String getLayoutName() {
        return layoutName;
    }

    @Override
    //Create a New Layout
    public boolean openPage() throws NotLoggedInException {
        return driver.getTitle().contains(layoutName);
    }

    //Open Existing layout
    public boolean openPage(String layoutName) {
        this.layoutName = layoutName;
        return driver.getTitle().contains(layoutName);
    }

    //Create a copy of an Existing layout
    public boolean openPage(String layoutName, boolean copy) {
        this.layoutName = layoutName + " - Copy";
        return driver.getTitle().contains(layoutName);
    }
}
