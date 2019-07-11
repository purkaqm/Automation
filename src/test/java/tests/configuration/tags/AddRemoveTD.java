package tests.configuration.tags;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.configuration.tags.TDListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class AddRemoveTD extends TestPage {


    TDListPage tdListPage;

    @Parameters({"tdName","workType"})
    @Test
    public void addTD(String tdName,String workType) throws NotLoggedInException {
        login();
        tdListPage = new TDListPage(driver);

        tdListPage.addTD(tdName).setName().selectWorkType(workType).submitForm();

    }
}
