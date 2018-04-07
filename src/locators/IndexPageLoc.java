package locators;

public enum IndexPageLoc implements LocatorAble {
    MAIN_URL("file:///C:/Dev/Projects/Automation/index.html"),
    BUTTON("Button01");

    IndexPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
