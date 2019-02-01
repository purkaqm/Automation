package tests.test;

import org.testng.annotations.Test;
import tests.TestPage;
import utils.seleniumObjects.TableObject;

public class Table extends TestPage {

    @Test
    public void testTable() {
        new TableObject(driver).getTable();
    }
}
