package pages.dashboard;

import static locators.dashboard.DashboardGridRowsLoc.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;


public class DashGridRows extends DashGrid {
    public DashGridRows(WebDriver driver) {
        super(driver);
    }

    public int getProjectRowNumber(String projectName) {
        List<WebElement> webElement = driver.findElements(By.xpath(PROJECT_ROWS.getLocator()));

        Iterator<WebElement> iterator = webElement.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getText());
        }


        return 0;
    }

}
