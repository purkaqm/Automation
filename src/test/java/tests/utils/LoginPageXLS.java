package tests.utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelUtils;



public class LoginPageXLS {


    @Test(dataProvider = "getData")
    public void testData(String login, String password) {
        System.out.println("Login: " + login + " Password: " + password);
    }

    @DataProvider
    public Object[][] getData() throws Exception {

        ExcelUtils utils = new ExcelUtils();

        return utils.getTableArray("source\\old.xls", "Sheet1");
    }
}
