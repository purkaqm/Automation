package locators.portfolios;

import locators.LocatorAble;

public enum AddPortfolioPageLoc implements LocatorAble {
    NAME_FIELD("PortfolioName"),
    SAVE_CHANGES("Submit");

    AddPortfolioPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
