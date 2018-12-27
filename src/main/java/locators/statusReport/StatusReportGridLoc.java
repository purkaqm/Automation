package locators.statusReport;

import locators.LocatorAble;

public enum StatusReportGridLoc implements LocatorAble {

    DEDICATED_GRID_URL("");

    String locator;

    StatusReportGridLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getProjectID(){

        return "";
    }
}
