package locators.configuration.tags;

import locators.LocatorAble;

public enum TDSummaryLoc implements LocatorAble{
    ;

    private String locator;

    TDSummaryLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
