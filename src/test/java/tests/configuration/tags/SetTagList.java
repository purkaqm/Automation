package tests.configuration.tags;

import org.testng.annotations.*;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;
import utils.ExcelUtils;

public class SetTagList extends TestPage {

    TagsListPage tagsListPage;


    @Test(dataProvider = "tagFileSource", enabled = true)
    public void createRootTag(String rootTag) throws Exception {

        String[][] twoColumnsList = new ExcelUtils().getTableArray("source\\" + rootTag + ".xls");


        login();
        // open Grid
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage();
        // create a new tag set, enter name and submit form
        tagsListPage.addNewTag(rootTag).setName().submitForm();
        // open Grid
        tagsListPage.openPage();
        // enter values
        tagsListPage.addTagSetValues(twoColumnsList, rootTag);


    }

    @Test(dataProvider = "tagFileSource", enabled = true)
    public void removeListOfTags(String rootTag) throws NotLoggedInException {
        login();
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage();
        tagsListPage.removeTagSet(rootTag);

    }


    @DataProvider
    public Object[][] tagFileSource() {

        String[][] data = {
                {"root"},
                {"tag001"},
                {"tag002"},
                {"tag003"},
                {"tag004"}
        };

        return data;
    }

}
