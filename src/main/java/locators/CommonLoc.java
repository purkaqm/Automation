package locators;

public enum CommonLoc implements LocatorAble {
    CONTEXT_URL("https://devxl.psteering.com/pristine_191_256120/"),

    // User Profile menu
    USER_PROFILE_MENU("//div[contains(@class,'userNameArrow')]"),
    USER_PROFILE_MENU_TIMESHEETS("//div[@id='popupUserSettingsWindow']//div[contains(text(),'Timesheets')]"),
    ;

    CommonLoc(String locator) {
        this.locator = locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
