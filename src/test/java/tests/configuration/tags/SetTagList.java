package tests.configuration.tags;

import org.testng.annotations.*;
import pages.configuration.tags.TagsListPage;
import tests.TestPage;
import utils.ExcelUtils;

public class SetTagList extends TestPage {

    TagsListPage tagsListPage;


    @Test(dataProvider = "tagFileSource")
    public void createRootTag(String rootTag) throws Exception {

        String[][] twoColumnsList = new ExcelUtils().getTableArray("source\\"+rootTag+".xls");


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
