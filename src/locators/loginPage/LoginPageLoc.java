package locators.loginPage;

import locators.LocatorAble;

public enum LoginPageLoc implements LocatorAble {
    LOGIN("loginField"), PASSWORD("passwordField"), LOGIN_BTN("//input[@class=\"signInButton\"]")


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
