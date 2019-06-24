package tests.utils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ExcelUtils;


public class setTagsXLS {

    String fileName;

    @BeforeTest
    @Parameters("fileName")
    public void setup(String fileName) {
        this.fileName = fileName;

    }


    @Test(dataProvider = "setTags", enabled = true)
    public void setTagValues(String sequence, String tagValue) {
        System.out.println("Seq: " + sequence + " Value: " + tagValue);
    }

    @DataProvider(name = "setTags")
    @Parameters("fileName")
    public Object[][] setTags() throws Exception {

        return new ExcelUtils().getTableArray(fileName, "Sheet1");
    }


}
