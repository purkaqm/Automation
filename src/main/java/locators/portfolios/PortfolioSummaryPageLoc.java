package locators.portfolios;

import locators.LocatorAble;

public enum PortfolioSummaryPageLoc implements LocatorAble {
    NAME_FIELD("");

    PortfolioSummaryPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
