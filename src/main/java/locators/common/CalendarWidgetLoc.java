package locators.common;

import locators.LocatorAble;

public enum CalendarWidgetLoc implements LocatorAble {


    ;

    private String locator;

    CalendarWidgetLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
