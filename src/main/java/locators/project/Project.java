package locators.project;

import locators.LocatorAble;

public enum Project implements LocatorAble {
    ;

    String locator;

    Project(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
