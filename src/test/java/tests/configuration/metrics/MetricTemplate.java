package tests.configuration.metrics;

import org.testng.annotations.Test;
import pages.configuration.templates.metrics.Grid;
import pages.exception.NotLoggedInException;
import tests.TestPage;

public class MetricTemplate extends TestPage {

    @Test
    public void testCreateMetricTemplate() throws NotLoggedInException {
        login();
        new Grid(driver).createNew().setName("PAPMPSMDASD").startDate("03/01/2019").next();
    }
}
