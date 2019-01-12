package locators.dashboard.layouts;


import locators.LocatorAble;

public enum StepsLoc implements LocatorAble {
    CONTINUE_BTN("//input[contains(@value,'Continue')]"),
    CANCEL_BTN("//div[contains(@class,'tight')]//input[contains(@value,'Cancel')]"),
    SAVE_AND_FINISH_BTN("//input[contains(@value,'Finish')]"),;

    StepsLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
