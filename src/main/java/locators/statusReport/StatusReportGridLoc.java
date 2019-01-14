package locators.statusReport;

import locators.LocatorAble;

public enum StatusReportGridLoc implements LocatorAble {

    DEDICATED_GRID_URL("ui-dist/works/" + PS_ID + "/status-reports");

    String locator;

    StatusReportGridLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getLocator(String projectID) {

        return DEDICATED_GRID_URL.getLocator().replace(PS_ID, projectID);
    }
}
