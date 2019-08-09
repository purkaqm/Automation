package locators.project;

import locators.LocatorAble;

public enum Project implements LocatorAble {

    // common

    PROJECT_SUMMARY("project/Summary1.epage?sp=U"),
    PROJECT_TITLE_FLD("//h2[@id='project-summary-name']//div[@class='editable-field-wrapper']"),

    // widgets

    EDIT_BTN("//p-header//div[contains(text(),'" + SS + "')]/following::i[1]"),
    SCHEDULE_WGT("Schedule"),
    TEAM_MEMBER_WGT("Team Members"),
    CONFIGURATION_WGT("Configuration"),

    ;

    private String locator;

    Project(String locator) {
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
