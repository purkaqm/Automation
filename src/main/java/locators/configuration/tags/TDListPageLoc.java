package locators.configuration.tags;


import locators.LocatorAble;

public enum TDListPageLoc implements LocatorAble {

    TD_GRID_PAGE_URL("admin/td/TDListing.epage"),


    ADD_NEW_BTN("//input[@value='Add New ']"),
    TD_NAME("//td[@class='nameColumnValue']//a[contains(text(),'" + SS + "')]"),


    // TD Popup

    NAME_TD_FLD("//input[@id='tdName']"),

    // TD Summary

    SOURCE_TAG_VALUE("//a[contains(text(),'" + SS + "')]"),

    // select tag menu & value
    SOURCE_TAG_MENU("//a[contains(text(),'" + SS + "')]"),

    TARGET_TAG("//select[@id='sel']//option[text()='" + SS + "']"),

    TARGET_TAG_VALUE(""),;


    private String locator;

    TDListPageLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    // Tree

    public String getLocator(String value) {
        return this.getLocator().replace(SS, value);
    }

}






