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

        login();
        assertTrue("Portfolio grid page opens",
                new PortfolioPage(driver).pageIsOpened());
    }

    @Test
    public void testAddButton() throws NotLoggedInException {

        login();
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.pageIsOpened();
        assertTrue("Add Portfolio Page doesn't open",
                portfolioPage.addPortfolioBtn("")
                        .pageIsOpened());
    }

    @Test
    public void testAddSimplePortfolio() throws NotLoggedInException, InterruptedException {
        // Имя нового портфолио

        String portfolioName = "!!! GK auto PortfolioName";

        login();

        // отрываем Portfolio Grid
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.pageIsOpened();

        // жмем кнопку Создать портфолио
        AddPortfolioPage addPortfolioPage = portfolioPage.addPortfolioBtn(portfolioName);

        // Вводим имя нового портфолио в поле NAME
        addPortfolioPage.addName();

        // Сохраняем portfolio
        PortfolioSummaryPage portfolioSummaryPage = addPortfolioPage.saveChangesBtn();

        // Появился ли Portfolio в гриде?
        assertTrue(portfolioName + " IS NOT FOUND",
                true);


    }

}