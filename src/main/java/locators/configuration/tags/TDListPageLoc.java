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
    TAG_IN_TD("//select[@id='rsel']//option[text()='" + SS + "']"),;

    private String locator;

    TDListPageLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getTDName(String tagName) {
        return TD_NAME.getLocator().replace(SS, tagName);
    }

    // локатор как второй параметр

}


