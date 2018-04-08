package locators;

public enum HomePageLoc implements LocatorAble {
    HOME_PAGE_URL("http://ord1qapp22ps.cinteractive.com:8080/pristine/Home.page")

    ;

    HomePageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }
}
