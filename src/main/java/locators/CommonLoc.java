package locators;

public enum CommonLoc implements LocatorAble {
    CONTEXT_URL("https://devxl.psteering.com/pristine_190_240940/");

    CommonLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
