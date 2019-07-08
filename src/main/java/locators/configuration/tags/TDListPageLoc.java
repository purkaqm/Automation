package locators.configuration.tags;


import locators.LocatorAble;

public enum TDListPageLoc implements LocatorAble {

    TD_GRID_PAGE_URL("admin/td/TDListing.epage"),


    ADD_NEW_BTN("//input[@value='Add New ']"),
    TD_NAME("//td[@class='nameColumnValue']//a[contains(text(),'" + SS + "')]")


    ;

    private String locator;

    TDListPageLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
