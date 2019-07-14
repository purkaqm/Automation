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
    TAG_IN_TD("//select[@id='rsel']//option[text()='" + SS + "']"),

    TARGET_TAG("//a[contains(text(),'" + SS +
            "')]/following::select[1]//option[contains(text(),'" + CC + "')]"),;

    // //a[contains(text(),'root 01')]//following::select[1]//option[contains(text(),'tag001')]

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

    public String getTargetTag(String sourceTag, String targetTag) {
        return TARGET_TAG.getLocator().replace(SS, sourceTag).replace(CC, targetTag);
    }

    // локатор как второй параметр

}


