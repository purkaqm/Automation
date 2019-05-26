package locators.timesheets;


import locators.LocatorAble;

public enum TimesheetsLoc implements LocatorAble {

    TIMESHEETS_URL(""),
    TIMESHEET_PROFILE("person/Timesheets.epage?sp=U" + USER_ID),
    TIMESHEET_PROFILE_NEW("person/Timesheets.epage?sp=U" + USER_ID + "&new-ui=true"),

    // Buttons

    DELETE_BTN("//i[contains(@class,'delete')]"),

    // View

    SUBMIT_BTN("//button[contains(text(),'Submit')]"),
    RECALL("//button[text()='Recall']"),
    LOCATION_BTN(""),
    SELECT_COLUMN_BTN(""),
    EXPORT_BTN(""),
    OLD_TIMESHEETS("//a[contains(text(),'old')]"),


    // Edit

    SAVE_BTN("//input[contains(@value,'Save Changes')]"),
    CANCEL_BTN("//button[contains(text(),'Cancel')]"),
    COPY_LAST_BTN("//button[contains(text(),'Copy')]"),

    // Date Fields and Buttons

    PREVIOUS_WEEK_BTN("status-reports-date-previous-week"),
    NEXT_WEEK_BTN("status-reports-date-next-week"),
    START_DATE_FIELD("//p-calendar[@id='status-reports-week-start-date']//input"),

    // START_DATE_FIELD("//input[@name='time_PSDatePicker']"),

    END_DATE_FIELD("//p-calendar[@id='status-reports-week-end-date']//input"),
    // CALENDAR_BTN("//i[contains(@class,'calendar')]"),
    CALENDAR_BTN("//button[@id='status-reports-calendar-button']//*"),

    // Widgets
    CALENDAR_WGT("//div[contains(@class,'datepicker ')]"),

    // Grid

    SELECT_EMPTY_WORK("//button[@class='work-selector-button']");

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

    public String getLocator2(String userID) {
        return TIMESHEET_PROFILE_NEW.getLocator().replace(USER_ID, userID);
    }
}
