package tests.portfolios;

import static org.junit.Assert.*;

import org.junit.Test;
import pages.portfolio.PortfolioPage;
import pages.exception.NotLoggedInException;
import tests.PageTest;

public class PortfolioPageTest extends PageTest {

    @Test
    public void testPortfolioPageOpens() throws NotLoggedInException {

        login("gregoryk", "gregory82");
        assertTrue("Portfolio grid page opens", new PortfolioPage(driver).pageIsOpened());
    }

    @Test
    public void testAddButton() throws NotLoggedInException {
        login("gregoryk", "gregory82");
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.pageIsOpened();
        assertTrue("Add Portfolio page opens", portfolioPage.addPortfolio().pageIsOpened());
    }
}