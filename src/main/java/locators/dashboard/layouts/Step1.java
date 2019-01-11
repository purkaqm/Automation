package locators.dashboard.layouts;

import locators.LocatorAble;

public enum Step1 implements LocatorAble {

    //Fields

    LAYOUT_NAME_FLD("//input[@id='DashLayoutName']"),
    DESCRIPTION_FLD("//textarea[@id='DashLayoutDescription']"),

    // Menus

    ADMINISTRATORS_MENU("//div[@id='popup_subAdminsShow']"),

    //CheckBoxes

    DEFAULT_CBOX("//input[@id='DashLayoutDefault']"),
    NOTIFY_PORTFOLIO_OWNERS_CBOX("//input[@id='NewLayoutAlertCheckbox']"),


    // Buttons

    CONTINUE_BTN("//input[contains(@value,'Continue')]"),
    CANCEL_BTN("//div[contains(@class,'tight')]//input[contains(@value,'Cancel')]"),
    SAVE_AND_FINISH_BTN("//input[contains(@value,'Finish')]"),;

    private String locator;

    Step1(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
