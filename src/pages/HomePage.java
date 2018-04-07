package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return "Element is not found";
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public void openPage() {

    }
}
