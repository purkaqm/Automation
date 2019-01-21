package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public void hoverHome(leftPanelItems leftPanel) {
        switch (leftPanel) {
            case HOME: {
                WebElement homeIcon = driver.findElement(By.xpath(LEFT_PNL_ADMIN.getLocator()));
                Actions action = new Actions(driver);
//                action.moveToElement(homeIcon).clickAndHold();
                homeIcon.click();
            }
            case ADD: {
            }
            case REVIEW: {
            }

        }
    }

     public enum leftPanelItems {
        HOME, ADD, REVIEW, ADMIN, PROJECT, FAVORITES, HISTORY, IMPORTANT, ANALYTICS
    }
}
