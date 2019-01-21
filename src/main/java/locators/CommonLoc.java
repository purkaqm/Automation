package locators;

public enum CommonLoc implements LocatorAble {
    CONTEXT_URL("https://devxl.psteering.com/pristine_191_256120/"),

    // User Profile menu
    USER_PROFILE_MENU("//div[contains(@class,'userNameArrow')]"),
    USER_PROFILE_MENU_TIMESHEETS("//div[@id='popupUserSettingsWindow']//div[contains(text(),'Timesheets')]"),


    // Left Nav panel

    LEFT_PNL_HOME("//a[contains(@title,'Home')]"),
    LEFT_PNL_ADD("//a[contains(@title,'Add')]"),
    LEFT_PNL_REVIEW("//a[contains(@title,'Review')]"),
    LEFT_PNL_ADMIN("//a[contains(@title,'Admin')]"),
    LEFT_PNL_PROJECT("//a[contains(@title,'Project')]"),
    LEFT_PNL_FAVOR("//div[@id='NavBar']//a[contains(@title,'Favor')]"),
    LEFT_PNL_HISTORY("//a[contains(@title,'History')]"),
    LEFT_PNL_IMPORTANT("//a[contains(@title,'Important')]"),
    LEFT_PNL_ANALYTICS("//a[contains(@title,'Analytics')]"),


    // Review items

    REVIEW_DASHBOARD("//div[@id='dash_item']"),

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
