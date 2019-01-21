package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.dashboard.DashGrid;
import pages.exception.NotLoggedInException;

import static locators.CommonLoc.*;

public class LeftPanel extends Page {
    public LeftPanel(WebDriver driver) {
        super(driver);
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }

    /**
     * Review Area : Dashboard
     */

    public DashGrid openDashboard() {
        hoverHome(LeftPanelAreas.REVIEW);
        selectReviewItem(ReviewItems.DASHBOARD);

        return new DashGrid(driver);
    }

    /**
     * Review Area : Visual Portals
     */

    public void openVisualPortals() {
        hoverHome(LeftPanelAreas.REVIEW);

    }

    /**
     * All icons in the Left Panel
     *
     * @param leftPanel
     */

    public void hoverHome(LeftPanelAreas leftPanel) {
        switch (leftPanel) {
            case HOME: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_HOME.getLocator()));
                Actions action = new Actions(driver);
                // mouse cursor to the HOME icon
                action.moveToElement(homeIcon).perform();
                break;
            }
            case ADD: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_ADD.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;

            }
            case REVIEW: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_REVIEW.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;
            }
            case ADMIN: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_ADMIN.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;

            }
            case PROJECT: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_PROJECT.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;

            }
            case FAVORITES: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_FAVOR.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;

            }
            case HISTORY: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_HISTORY.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;
            }

            case IMPORTANT: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_IMPORTANT.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;

            }
            case ANALYTICS: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_ANALYTICS.getLocator()));
                Actions action = new Actions(driver);
                action.moveToElement(homeIcon).perform();
                break;

            }

        }
    }

    public enum LeftPanelAreas {
        HOME, ADD, REVIEW, ADMIN, PROJECT, FAVORITES, HISTORY, IMPORTANT, ANALYTICS
    }

    public void selectReviewItem(ReviewItems reviewItems) {
        switch (reviewItems) {
            case DASHBOARD:
                driver.findElement(By.xpath(REVIEW_DASHBOARD.getLocator())).click();
        }
    }

    public enum ReviewItems {
        DASHBOARD,
        VISUAL_PORTALS, VP_MANAGE_LAYOUTS, VP_ADD,
        RESOURCE_REVIEW,
        EXECUTIVE_REVIEW,
        FINANCIAL_REVIEW,
        PORTFOLIOS,
        MEASURE_LIBRARY,
        REPORTS,
        USER_MANAGEMENT,
        IMPORT_EXPORT,
        METRIC_BULK
    }

}
