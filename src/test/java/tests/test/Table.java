package tests.test;

import org.testng.annotations.Test;
import pages.exception.NotLoggedInException;
import tests.TestPage;

import utils.seleniumObjects.*;

public class Table extends TestPage {

    @Test
    public void testTable() throws NotLoggedInException {
        TableObject tableObject = new TableObject(driver);

        tableObject.getTable();
    }
}
