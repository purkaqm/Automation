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

    public TagSummary openTagSet(String tagName) throws NotLoggedInException {
        openPage();
        log("Open tag set : " + tagName);
        driver.findElement(By.xpath(TAG_SET_NAME.getTagName(tagName))).click();
        return new TagSummary(driver);
    }

    public void removeTagSet(String tagName) {
        log("Click on Remove tag set button: " + tagName);


        driver.findElement(By.xpath(TAG_SET_NAME.getTagName(tagName) + REMOVE_CHECKBOX.getLocator())).click();

        log("Click on OK button");
        driver.findElement(By.xpath(YES_BTN.getLocator())).click();
    }


    public void addTagSetValues(String[] values, String tagName) throws NotLoggedInException {

        // open tag set
        TagSummary tagSummary = openTagSet(tagName);
        // open Update Page and Enter values
        tagSummary.openUpdateTagsPage().changeValues(values).applyChanges();


    }

    public void addTagSetValues(String[][] values, String tagName) throws NotLoggedInException {
        // open tag set
        TagSummary tagSummary = openTagSet(tagName);
        // open Update Page and Enter values
        tagSummary.openUpdateTagsPage().changeValues(values).applyChanges();


    }
}
