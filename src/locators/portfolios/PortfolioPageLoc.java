package locators.portfolios;

import locators.LocatorAble;

public enum PortfolioPageLoc implements LocatorAble {
    PORTFOLIO_PAGE_URL("person/Portfolios.epage"), // Portfolios dedicated page
    ADD_PORTFOLIO_BTN("//a[@id=\"AddPortfolioLink\"]/following::input") // Add Portfolio button
    ;

    PortfolioPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
