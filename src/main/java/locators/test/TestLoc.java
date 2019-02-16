package locators.test;

import locators.LocatorAble;

public enum TestLoc implements LocatorAble {

    MAIN_DIV("//div")
    ;

    private String locator;

    TestLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
