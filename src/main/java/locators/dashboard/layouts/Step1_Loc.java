package locators.dashboard.layouts;

import locators.LocatorAble;

public enum Step1_Loc implements LocatorAble {

    //Fields

    LAYOUT_NAME_FLD("//input[@id='DashLayoutName']"),
    DESCRIPTION_FLD("//textarea[@id='DashLayoutDescription']"),

    // Menus

    ADMINISTRATORS_MENU("//div[@id='popup_subAdminsShow']"),

    //CheckBoxes

    DEFAULT_CBOX("//input[@id='DashLayoutDefault']"),
    NOTIFY_PORTFOLIO_OWNERS_CBOX("//input[@id='NewLayoutAlertCheckbox']"),;

    private String locator;

    Step1_Loc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
