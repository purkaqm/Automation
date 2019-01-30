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

    public void pause(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
