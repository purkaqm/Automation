package locators.timesheets;


import locators.LocatorAble;

public enum TimesheetsLoc implements LocatorAble {

    TIMESHEETS_URL(""),
    TIMESHEET_PROFILE("person/UserProfile.epage?sp=U" + USER_ID),

    // Buttons
    // View

    SUBMIT_BTN(""),
    RECALL("//button[text()='Recall']"),
    LOCATION_BTN(""),
    SELECT_COLUMN_BTN(""),
    EXPORT_BTN(""),
    OLD_TIMESHEETS("//a[contains(text(),'old')]"),


    // Edit

    SAVE_CHANGES_BTN("//input[contains(@value,'Save Changes')]"),
    SAVE_SUBMIT_BTN("//input[contains(@value,'Save & Submit')]"),
    CANCEL_BTN("//input[contains(@value,'Cancel')]"),
    ADD_BTN("//div[contains(@class,'toolbar-top')]//input[contains(@value,'Add')]"),
    GO_BTN("//div[contains(@class,'toolbar-top')]//input[contains(@value,'Go')]"),
    COPY_LAST_BTN("//div[contains(@class,'toolbar-top')]//a[contains(text(),'Copy')]"),

    // Date Fields and Buttons

    PREVIOUS_WEEK_BTN("status-reports-date-previous-week"),
    NEXT_WEEK_BTN("status-reports-date-next-week"),
    START_DATE_FIELD("//p-calendar[@id='status-reports-week-start-date']//input"),
    END_DATE_FIELD("//p-calendar[@id='status-reports-week-end-date']//input"),
    CALENDAR_BTN("//button[@id='status-reports-calendar-button']"),


    // Widgets
    CALENDAR_WGT("//div[contains(@class,'datepicker ')]"),

    ;

    private String locator;

    TimesheetsLoc(String locator) {
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
