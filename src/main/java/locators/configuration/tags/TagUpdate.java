package locators.configuration.tags;


import locators.LocatorAble;

public enum TagUpdate implements LocatorAble {

    SEQ_FLD("//table[@id='PSTable']//td[@class='sequenceColumnValue']/input"),
    NAME_FLD("//table[@id='PSTable']//td[@class='nameColumnValue']/input"),
    UPDATE_BTN("//input[@id='deleteTagValues']"),
    ;

    String locator;

    TagUpdate(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
