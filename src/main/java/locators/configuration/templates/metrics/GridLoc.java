package locators.configuration.templates.metrics;

import locators.LocatorAble;


public enum GridLoc implements LocatorAble {

    METRIC_TEMPLATES_GRID_URL("admin/MetricTemplates.page"),
    ADD_NEW_BTN("//a[@title='Create New Metric Template']"),


    ;

    private String locator;

    GridLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
