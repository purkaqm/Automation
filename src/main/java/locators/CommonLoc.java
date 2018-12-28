package locators;

public enum CommonLoc implements LocatorAble {
    CONTEXT_URL("https://devxl.psteering.com/pristine_191_256120/");

    CommonLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
