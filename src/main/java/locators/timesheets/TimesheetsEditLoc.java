package locators.timesheets;

import locators.LocatorAble;

public enum TimesheetsEditLoc implements LocatorAble{

    // Buttons

    SAVE_CHANGES_BTN("//input[contains(@value,'Save Changes')]"),
    SAVE_SUBMIT_BTN("//input[contains(@value,'Save & Submit')]"),
    CANCEL_BTN("//input[contains(@value,'Cancel')]"),
    ADD_BTN("//div[contains(@class,'toolbar-top')]//input[contains(@value,'Add')]"),
    GO_BTN("//div[contains(@class,'toolbar-top')]//input[contains(@value,'Go')]"),
    COPY_LAST_BTN("//div[contains(@class,'toolbar-top')]//a[contains(text(),'Copy')]")
    ;

    private String locator;

    TimesheetsEditLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
