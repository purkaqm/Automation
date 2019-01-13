package locators.dashboard;


import locators.LocatorAble;

public enum DashLayoutsLoc implements LocatorAble {

    DASHBOARD_LAYOUTS_GRID_URL("admin/Layouts.epage?sp=Sdash"),

    // NavigationButtons

    ADD_NEW_TOP_BTN("//div[contains(@class,'top')]//input[@value='Add New']"),
    ADD_NEW_BOTTOM_BTN("//div[contains(@class,'bottom')]//input[@value='Add New']"),
    DELETE_TOP_BTN("//div[contains(@class,'top')]//input[@value='Delete']"),
    DELETE_BOTTOM_BTN("//div[contains(@class,'bottom')]//input[@value='Delete']"),
    COPY_PROJECT_BTN("//a[text()='" + SS + "']/preceding::img[1])"),


    ;

    String locator;

    DashLayoutsLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getLocator2(String projectName) {
        return COPY_PROJECT_BTN.getLocator().replace(SS, projectName);
    }
}
