package locators;

public enum LoginPageLoc implements LocatorAble {
    LOGIN("loginField"), PASSWORD("passwordField");

    LoginPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
