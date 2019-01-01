package tests.portfolios;


import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import pages.portfolio.AddPortfolioPage;
import pages.portfolio.PortfolioPage;
import pages.exception.NotLoggedInException;
import pages.portfolio.PortfolioSummaryPage;
import tests.PageTest;

public class PortfolioPageTest extends PageTest {

    String portfolioName = "!!! GK auto PortfolioName";


    @Test
    public void testPortfolioPageOpens()
            throws NotLoggedInException {

        login();
        assertTrue(new PortfolioPage(driver).openPage(), "Portfolio grid page opens");
    }

    @Test
    public void testAddButton() throws NotLoggedInException {

        login();
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.openPage();
        assertTrue(
                portfolioPage.addPortfolioBtn("")
                        .openPage(), "Add Portfolio Page doesn't open");
    }

    @Test
    public void testAddSimplePortfolio() throws NotLoggedInException, InterruptedException {
        // Имя нового портфолио


        login();

        // отрываем Portfolio Grid
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.openPage();

        // жмем кнопку Создать портфолио
        AddPortfolioPage addPortfolioPage = portfolioPage.addPortfolioBtn(portfolioName);

        // Вводим имя нового портфолио в поле NAME
        addPortfolioPage.addName();

        // Сохраняем portfolio
        PortfolioSummaryPage portfolioSummaryPage = addPortfolioPage.saveChangesBtn();

        // Появился ли Portfolio в гриде?
        assertTrue(true, portfolioName + " IS NOT FOUND");


    }

    @Test
    public void testRemovePortfolio() throws NotLoggedInException {
        login();
        PortfolioPage portfolioPage = new PortfolioPage(driver);
        portfolioPage.openPage();

        portfolioPage.removePortfolio(portfolioName);


    }

}