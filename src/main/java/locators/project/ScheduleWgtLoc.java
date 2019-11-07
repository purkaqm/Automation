package locators.project;


import locators.LocatorAble;

public enum ScheduleWgtLoc implements LocatorAble {

    CONSTRAIN_DD_MENU("//div[text()='Constraint type']/following::p-dropdown"),


    // constraint types

    TYPE("//li//span[text()='" + SS + "']"),
    ASAP("As Soon As Possible"),
    ALAP("As Late As Possible"),
    MSO("Must Start On"),


    // date fields

    PLANNED_START_DATE("//input[@name='plannedStartDate']"),
    PLANNED_END_DATE("//input[@name='plannedEndDate']"),
    ACTUAL_START_DATE("//input[@name='actualStartDate']"),
    ACTUAL_END_DATE("//input[@name='actualEndDate']"),

    // buttons

    SAVE_BTN("//button[@title='Save']"),;

    private String locator;

    ScheduleWgtLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getLocator(String locator) {
        return this.getLocator().replace(SS, locator);
    }
}

