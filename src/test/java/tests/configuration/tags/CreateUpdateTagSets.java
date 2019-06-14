package tests.configuration.tags;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class CreateUpdateTagSets extends TestPage {

    TagsListPage tagset;
    String tagSetName = "~~~PamPariruram~~~";

    String[] values001 = {"0001", "value001"};
    String[] values002 = {"0002", "value002"};
    String[] values003 = {"0003", "value003"};

    String[][] allValues = {{}, {}};


    // Add Tag values to the specified tag set


    @Test(enabled = true)
    public void createSeveralTagSets() throws NotLoggedInException {


        // Create a new tag set
        login();
        tagset = new TagsListPage(driver);
        addBlankTagSet(tagSetName, tagset);

        // Enter some values
        tagset.addTagSetValues(values001, tagSetName);
        tagset.addTagSetValues(values002, tagSetName);
        tagset.addTagSetValues(values003, tagSetName);


    }

    private void addBlankTagSet(String tagSetName, TagsListPage tagSet) throws NotLoggedInException {
        tagSet.openPage();
        tagSet.addNewTag(tagSetName).setName().submitForm();

    }

}
