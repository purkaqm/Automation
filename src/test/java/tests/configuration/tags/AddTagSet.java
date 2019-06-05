package tests.configuration.tags;

import org.testng.annotations.Test;
import pages.configuration.tags.TagSummary;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class AddTagSet extends TestPage {

    TagsListPage tagsListPage;
    pages.configuration.tags.addTagPopUp addTagPopUp;
    TagSummary tagSummary;

    String tagName = "~~~Test Tag Name~~~";

    @Test
    public void testAddNewTagSet() throws NotLoggedInException {

        login();
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage(); // Open Admin >> Configuration >> Tags page

        addTagPopUp = tagsListPage.addNewTag(tagName); // Add New tag dialog window opens
        addTagPopUp.setName();
    }

    @Test
    public void testOpenTagSet() throws NotLoggedInException {
        login();
        tagsListPage.openPage();
        tagsListPage.openTagSet(tagName);
    }

    @Test
    public void testRemoveTagSet() throws NotLoggedInException {
        login();
        tagsListPage.openPage();
        tagsListPage.removeTagSet(tagName);
    }
}
