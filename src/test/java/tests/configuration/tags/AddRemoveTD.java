package tests.configuration.tags;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.configuration.tags.TDListPage;
import pages.configuration.tags.TDSummary;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class AddRemoveTD extends TestPage {


    TDListPage tdListPage;

    @Parameters({"tdName", "workType"})
    @Test(enabled = false)
    public void addTD(String tdName, String workType) throws NotLoggedInException {
        login();
        tdListPage = new TDListPage(driver);

        tdListPage.addTD(tdName).setName().selectWorkType(workType).submitForm();

    }

    @Parameters({"tdName","sourceTagValue", "targetTag", "targetTagValue"})
    @Test(enabled = true)
    public void updateTD(String tdName, String sourceTagValue, String targetTag, String targetTagValue) throws NotLoggedInException {

        login();

        new TDListPage(driver).openTD(tdName).tagUnder(sourceTagValue,targetTag,targetTagValue);

        //new TDListPage(driver).openTD(tdName).directEntering();

        /*new TDListPage(driver).openTD(tdName).tagUnder("Top", "root", "root 01")
                .tagUnder("root 01", "tag001", "green").
                tagUnder("Top", "root", "root 02").
                tagUnder("root 02", "tag001", "red")
        ;*/

    }
}
