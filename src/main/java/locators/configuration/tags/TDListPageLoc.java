package locators.configuration.tags;


import locators.LocatorAble;

public enum TDListPageLoc implements LocatorAble {

    TD_GRID_PAGE_URL("admin/td/TDListing.epage"),


    ADD_NEW_BTN("//input[@value='Add New ']"),
    TD_NAME("//td[@class='nameColumnValue']//a[contains(text(),'" + SS + "')]"),

    NAME_TD_FLD("//input[@id='tdName']"),
    TOP("//a[contains(text(),'Top')]"),
    TAG_MENU("//select[@id='rsel']"),
    TAG_NAME("//select[@id='rsel']//option[text()='" + SS + "']"),;


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
