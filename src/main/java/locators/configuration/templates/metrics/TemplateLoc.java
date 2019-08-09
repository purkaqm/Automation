package locators.configuration.templates.metrics;

import locators.LocatorAble;

public enum TemplateLoc implements LocatorAble{

    // Common fields

    NEXT_BTN("//a[@title='Continue']"),


    // Basic info tab

    NAME_FLD("//input[@name='objectName']"),
    START_DATE_FLD("//input[@id='START']"),

    // Display tab









    ;

    private String locator;

    TemplateLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
