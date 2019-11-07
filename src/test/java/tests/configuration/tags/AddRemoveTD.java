package tests.configuration.tags;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.configuration.tags.TDListPage;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class AddRemoveTD extends TestPage {


    TDListPage tdListPage;

    @Parameters({"tdName","workType"})
    @Test(enabled = true)
    public void addSingleTD(String tdName,String workType) throws NotLoggedInException {
        login();

        tdListPage = new TDListPage(driver);
        // create td
        tdListPage.clickAddTD(tdName).setName().selectWorkType(workType).submitForm();
    }

    @Parameters({"tdName"})
    @Test(enabled = false)
    public void removeSingleTD(String tdName) throws NotLoggedInException {
        login();

        tdListPage = new TDListPage(driver);
        tdListPage.removeTD(tdName);
    }

    @Parameters({"tdName", "workType"})
    @Test(enabled = false)
    public void addTD(String tdName, String workType) throws NotLoggedInException {
        login();
        tdListPage = new TDListPage(driver);

        tdListPage.clickAddTD(tdName).setName().selectWorkType(workType).submitForm();

    }

    //@Parameters({"tdName", "sourceTagValue", "targetTag", "targetTagValue"})


    @Test(enabled = false, dataProvider = "setValues")
    public void updateTD(String tdName, String sourceTagValue, String targetTag, String targetTagValue) throws NotLoggedInException {

        login();

        new TDListPage(driver).openTD(tdName).tagUnder(sourceTagValue, targetTag, targetTagValue);

    }

    @DataProvider
    public Object[][] setValues() {
        return new String[][]{{"temporaryTD", "Top", "root", "root 01"},
                {"temporaryTD", "Top", "root", "root 02"},
                {"temporaryTD", "root 01", "tag001", "red"},
                {"temporaryTD", "root 02", "tag001", "green"},


        };
    }
}
