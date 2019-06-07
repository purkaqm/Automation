package tests.configuration.tags;

import org.testng.annotations.Test;
import pages.configuration.tags.AddTagPopUp;
import pages.configuration.tags.TagSummary;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class AddRemoveTagSet extends TestPage {

    private TagsListPage tagsListPage;
    TagSummary tagSummary;

    String tagName = "????Test Tag Name~~~";
    String workTypeName ="Program";

    @Test
    public void testAddNewTagSet() throws NotLoggedInException {

        login();
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage(); // Open Admin >> Configuration >> Tags page

        AddTagPopUp addTagPopUp = tagsListPage.addNewTag(tagName);
        addTagPopUp.setName();
        addTagPopUp.selectWorkType(workTypeName);

        addTagPopUp.submitForm();




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
