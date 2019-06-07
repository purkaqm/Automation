package locators.configuration.tags;

import locators.LocatorAble;

public enum TagSetSummary implements LocatorAble {

    UPDATE_BTN("//a[contains(text(),'Update')]"),


    ;


    private String locator;

    TagSetSummary(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
