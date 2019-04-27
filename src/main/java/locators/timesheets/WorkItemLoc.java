package locators.timesheets;

import locators.LocatorAble;

public enum WorkItemLoc implements LocatorAble {

    MY_WORK_TAB("//a//span[contains(text(),'My Work')]"),
    FAVOURITES_TAB("//span[contains(text(),'Favorites')]"),
    BROWSE_TAB("//a//span[contains(text(),'Browse')]"),
    SEARCH_TAB("//a//span[contains(text(),'Search')]"),

    WORK_ITEM_NAME("//td//span[contains(text(),'" + PS_NAME + "')]/preceding::span[1]"),;

    private String locator;

    WorkItemLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getLocator(String workName) {
        return WORK_ITEM_NAME.getLocator().replace(PS_NAME, workName);
    }
}
