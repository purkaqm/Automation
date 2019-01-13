package tests.utils;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;
import pages.cheat.Clicker;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class ClickerTestPage extends TestPage {
    @Test
    public void testClicker() throws NotLoggedInException {
            new Clicker(driver).openPage();

    }
}
