package locators.timesheets;


import locators.LocatorAble;

public enum TimesheetsViewLoc implements LocatorAble {

    TIMESHEETS_VIEW_URL(""),
    TIMESHEET_PROFILE("person/UserProfile.epage?sp=U" + USER_ID),

    // Buttons

    ADD_BTN(""),
    COPY_LAST_BTN("//a[text()='Copy Last']"),
    SUBMIT_BTN(""),
    LOCATION_BTN(""),
    SELECT_COLUMN_BTN(""),
    EXPORT_BTN(""),
    EDIT_BTN("//a[text()='Edit']");

    private String locator;

    TimesheetsViewLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getLocator(String userID) {
        return TIMESHEET_PROFILE.getLocator().replace(USER_ID, userID);
    }
}
