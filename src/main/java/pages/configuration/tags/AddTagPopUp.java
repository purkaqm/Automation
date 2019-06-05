package pages.configuration.tags;

import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

public class AddTagPopUp extends Page{

    String tagName;


    public AddTagPopUp(WebDriver driver, String tagName) {
        super(driver);
        this.tagName = tagName;
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }
}
