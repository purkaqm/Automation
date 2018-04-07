package locators;

public enum CommonLoc implements LocatorAble {
    CONTEXT_URL("http://ord1qapp22ps.cinteractive.com:8080/pristine/");

    CommonLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
