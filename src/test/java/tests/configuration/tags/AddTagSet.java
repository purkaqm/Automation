package tests.configuration.tags;

import org.testng.annotations.Test;
import pages.configuration.tags.AddTagPopUp;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class AddTagSet extends TestPage {

    TagsListPage tagsListPage;
    AddTagPopUp addTagPopUp;

    String tagName = "~~~Test Tag Name~~~";

    @Test
    public void testAddNewTagSet() throws NotLoggedInException {

        login();
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage(); // Open Admin >> Configuration >> Tags page

        addTagPopUp = tagsListPage.addNewTag(tagName); // Add New tag dialog window opens

    }
}
