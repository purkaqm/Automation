package widgets;

import org.openqa.selenium.WebDriver;

import static locators.CommonLoc.CONTEXT_URL;

public abstract class WidgetObject implements WidgetAble{

    protected String context = CONTEXT_URL.getLocator();

    protected WebDriver driver;

    protected static boolean loggedIn = false;


    public WidgetObject(WebDriver driver) {
        this.driver = driver;
    }
}
