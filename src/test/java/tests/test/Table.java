package tests.test;

import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import tests.TestPage;

import utils.seleniumObjects.*;

import static locators.test.TestLoc.*;

public class Table extends TestPage {

    @Test
    public void testTable() throws NotLoggedInException {
        TableObject tableObject = new TableObject(driver, MAIN_DIV);
        tableObject.selectTableItem("28");
        tableObject.getTable();
    }
}
