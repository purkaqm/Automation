package locators.dashboard.layouts;

import locators.LocatorAble;

public enum Step2_Loc implements LocatorAble {

    // Menus

    ADD_PROJECT_TAG(""),
    ADD_USER_TAG(""),
    ADD_CUSTOM_FIELD(""),
    ADD_MEASURE(""),
    ADD_METRIC(""),

    CHANGE_STEP1("//a[@id='LinkSubmit_1']"),

    ;


    private String locator;


    Step2_Loc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
