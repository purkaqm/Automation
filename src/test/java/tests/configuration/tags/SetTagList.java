package tests.configuration.tags;

import org.testng.annotations.*;
import pages.configuration.tags.TagsListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;
import utils.ExcelUtils;

public class SetTagList extends TestPage {

    TagsListPage tagsListPage;
    String[][] data;
    String workTypeName = "GK project";


    @Test(dataProvider = "tagFileSource", enabled = false)
    public void createRootTag(String rootTag) throws Exception {

        String[][] twoColumnsList = new ExcelUtils().getTableArray("source\\" + rootTag + ".xls");


        login();
        // open Grid
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage();
        // create a new tag set, enter name and submit form
        tagsListPage.addNewTag(rootTag).setName().selectWorkType(workTypeName).submitForm();
        // open Grid
        tagsListPage.openPage();
        // enter values
        tagsListPage.addTagSetValues(twoColumnsList, rootTag);


    }

    @Test(dataProvider = "tagFileSource", enabled = false)
    public void removeListOfTags(String rootTag) throws NotLoggedInException {
        login();
        tagsListPage = new TagsListPage(driver);
        tagsListPage.openPage();
        tagsListPage.removeTagSet(rootTag);

    }

    @Parameters({"root", "tag1", "tag2", "tag3", "tag4"})
    @BeforeClass
    public void setFileNames(String root, String tag1, String tag2, String tag3, String tag4) {

        this.data = new String[][]{{root}, {tag1}, {tag2}, {tag3}, {tag4}};
    }


    @DataProvider
    public Object[][] tagFileSource() {

        return data;
    }

}
