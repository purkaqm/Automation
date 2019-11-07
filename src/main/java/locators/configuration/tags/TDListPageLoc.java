package locators.configuration.tags;


import locators.LocatorAble;

public enum TDListPageLoc implements LocatorAble {

    TD_GRID_PAGE_URL("admin/td/TDListing.epage"),


    ADD_NEW_BTN("//input[@value='Add New ']"),
    TD_NAME("//td[@class='nameColumnValue']//a[contains(text(),'" + SS + "')]"),
    TD_DD_MENU("//a[contains(text(),'" + SS + "')]/following::img[1]"),
    DELETE_MENU_VALUE("//td[contains(@id,'ps_ui_MenuItem')and text()='Delete']"),
    CONFIRM_YES("//div[text()='Confirm Delete']/following::input[@value='Yes']"),


    // TD Popup

    NAME_TD_FLD("//input[@id='tdName']"),

    UPDATE_DETAILS_BTN("//input[@id='Submit']"),

    // TD Summary


    // select tag menu & value
    SOURCE_TAG_MENU("//a[contains(text(),'" + SS + "')]"),

    TARGET_TAG("//select[@id='sel']//option[text()='" + SS + "']"),

    TARGET_TAG_TOP("//select[@id='rsel']//option[text()='" + SS + "']"),

    TAG_VALUE_MENU("//div[@id='AStd_asmultidisp']"),

    TAG_VALUE("//ul[@id='AStd_asmulti_ul']//label[contains(text(),'" + SS + "')]//preceding::input[1]"),

    DONE_BTN("//div[@id='AStd_asmultidisp_dropdown']//input[@value='Done']"),

    CANCEL_BTN("//div[@id='AStd_asmultidisp_dropdown']//input[@value='Cancel']"),

    REMOVE_TAG_BTN("//a[contains(text(),'" + SS + "')]/following::img[1]"),

    SUBMIT_BTN("//input[@id='tdeditSubmit']"),;


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






