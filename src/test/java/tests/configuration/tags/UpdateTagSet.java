package tests.configuration.tags;

import org.testng.annotations.Test;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class UpdateTagSet extends TestPage {

    TagsListPage tagset;
    String tagSetName = "~~~PamPariruram~~~";

    String[] values = {"value001", "value002"};


    @Test
    public void addValuesToTagSet() throws NotLoggedInException {

        login();
        tagset = new TagsListPage(driver);

        // create an empty tagSet
        addBlankTagSet(tagSetName, tagset);
        // Open THIS tagset
        tagset.openTagSet(tagSetName);
        // Add a list of values
        tagset.addTagSetValues(values, tagSetName);

    }

    private void addBlankTagSet(String tagSetName, TagsListPage tagSet) throws NotLoggedInException {
        tagSet.openPage();
        tagSet.addNewTag(tagSetName).setName().submitForm();

    }

}
