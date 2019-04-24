package locators.timesheets;

import locators.LocatorAble;

public enum WorkItemLoc implements LocatorAble {

    MY_WORK_TAB("//a//span[contains(text(),'My Work')]"),
    FAVOURITES_TAB("//span[contains(text(),'Favorites')]"),
    BROWSE_TAB("//a//span[contains(text(),'Browse')]"),
    SEARCH_TAB("//a//span[contains(text(),'Search')]"),

    ;

    private String locator;

    WorkItemLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
