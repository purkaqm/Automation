package locators.project;

import locators.LocatorAble;

public enum ProjectLoc implements LocatorAble {

    // common

    PROJECT_SUMMARY("project/Summary1.epage?sp=U"),
    PROJECT_TITLE_FLD("//h2[@id='project-summary-name']//div[@class='editable-field-wrapper']"),
    EDIT_DETAILS_BTN("//button[contains(text(),'Edit All Details')]"),

    MSTEAMS_BTN("//button[contains(@class,'ms-teams')]"),

    // widgets

    EDIT_BTN("//p-header//div[contains(text(),'" + SS + "')]/following::i[1]"),
    SCHEDULE_WGT("Schedule"),
    TEAM_MEMBER_WGT("Team Members"),
    CONFIGURATION_WGT("Configuration"),

    ;

    private String locator;

    ProjectLoc(String locator) {
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
