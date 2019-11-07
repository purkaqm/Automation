package tests.configuration.tags;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.configuration.tags.AddTagPopUp;
import pages.configuration.tags.TagSummary;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class
AddRemoveTagSet extends TestPage {

    private TagsListPage tagsListPage;
    TagSummary tagSummary;

    @Parameters({"workType", "tagName"})
    @Test(enabled = true)
    public void testAddNewTagSet(String workType, String tagName) throws NotLoggedInException {

        login();
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage(); // Open Admin >> Configuration >> Tags page

        AddTagPopUp addTagPopUp = tagsListPage.addNewTag(tagName);
        addTagPopUp.setName();
        addTagPopUp.selectWorkType(workType);

        addTagPopUp.submitForm();


    }

    @Parameters("tagName")
    @Test(enabled = false)
    public void testOpenTagSet(String tagName) throws NotLoggedInException {
        login();
      //  tagsListPage.openPage();
        tagsListPage.openTagSet(tagName);
    }

    @Parameters("tagName")
    @Test(enabled = false)
    public void testRemoveTagSet(String tagName) throws NotLoggedInException {
        login();

       // tagsListPage.openPage();
        tagsListPage.removeTagSet(tagName);
    }
}
