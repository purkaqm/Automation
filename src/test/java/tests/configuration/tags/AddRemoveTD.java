package tests.configuration.tags;


import org.testng.annotations.Test;
import pages.configuration.tags.TDListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class AddRemoveTD extends TestPage {

    TDListPage tdListPage;

    @Test
    public void addTD() throws NotLoggedInException {
        login();
        tdListPage = new TDListPage(driver);

        tdListPage.addTD();


    }
}
