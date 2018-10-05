package locators.homePage;

import locators.LocatorAble;


public enum HomePageLoc implements LocatorAble {
    HOME_PAGE_URL("Home.page")

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
