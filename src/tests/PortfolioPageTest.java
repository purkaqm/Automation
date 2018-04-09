package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.portfolio.PortfolioPage;
import pages.exception.NotLoggedInException;

public class PortfolioPageTest extends PageTest {

    @Test
    public void testPortfolioPageOpens() throws NotLoggedInException {

        login("gregoryk", "gregory82");
        Assert.assertTrue(new PortfolioPage(driver).pageIsOpened());
        System.out.println(driver.getTitle());
    }
    @Test
    public void testAddButton() throws NotLoggedInException {
        login("gregoryk", "gregory82");
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.addPortfolio();

    }
}