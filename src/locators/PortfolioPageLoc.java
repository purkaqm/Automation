package locators;

public enum PortfolioPageLoc implements LocatorAble{
    PORTFOLIO_PAGE_URL("person/Portfolios.epage");

    PortfolioPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
