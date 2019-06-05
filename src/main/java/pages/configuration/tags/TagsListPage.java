package pages.configuration.tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.exception.NotLoggedInException;

import static locators.configuration.tags.TagsListPageLoc.*;

public class TagsListPage extends Page {
    public TagsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return (driver.getTitle());
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        driver.get(context + TAGS_GRID_PAGE_URL.getLocator());
        log(pageTitle());
        return true;
    }

    public AddTagPopUp addNewTag(String tagName) {

        log("Add New Tag - dialog window");
        driver.findElement(By.xpath(ADD_NEW_TAG_BTN.getLocator())).click();
        return new AddTagPopUp(driver, tagName);
    }
}
