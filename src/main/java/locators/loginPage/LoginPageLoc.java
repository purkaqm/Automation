package locators.loginPage;

import locators.LocatorAble;

public enum LoginPageLoc implements LocatorAble {
    LOGIN("loginField"), PASSWORD("passwordField"), LOGIN_BTN("//input[@class=\"signInButton\"]"),
    LOCALE("localeSelect"),LOCALE_ENGLISH("//div[text()='English']"),


    ;

    LoginPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
