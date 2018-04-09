package tests.portfolios;

import static org.junit.Assert.*;

import org.junit.Test;
import pages.portfolio.AddPortfolioPage;
import pages.portfolio.PortfolioPage;
import pages.exception.NotLoggedInException;
import pages.portfolio.PortfolioSummaryPage;
import tests.PageTest;

public class PortfolioPageTest extends PageTest {


    @Test
    public void testPortfolioPageOpens()
            throws NotLoggedInException {

        login("gregoryk", "gregory82");
        assertTrue("Portfolio grid page opens",
                new PortfolioPage(driver).pageIsOpened());
    }

    @Test
    public void testAddButton() throws NotLoggedInException {
        login("gregoryk", "gregory82");
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.pageIsOpened();
        assertTrue("Add Portfolio Page doesn't open",
                portfolioPage.addPortfolioBtn("")
                        .pageIsOpened());
    }

    @Test
    public void testAddSimplePortfolio() throws NotLoggedInException {
        String portfolioName = "!!! GK auto PortfolioName";              // Имя нового портфолио

        login("gregoryk", "gregory82");
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.pageIsOpened();                                    // отрываем Portfolio Grid
        AddPortfolioPage addPortfolioPage =
                portfolioPage.addPortfolioBtn(portfolioName);            // жмем кнопку Создать портфолио

        addPortfolioPage.addName();                                      // Вводим имя нового портфолио в поле NAME
        PortfolioSummaryPage portfolioSummaryPage =
                addPortfolioPage.saveChangesBtn();                       // Сохраняем portfolio
        assertTrue(portfolioName + " IS NOT FOUND",
                false);                                          // Появился ли Portfolio в гриде?


    }

}