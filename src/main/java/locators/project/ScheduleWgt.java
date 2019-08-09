package locators.project;


import locators.LocatorAble;

public enum ScheduleWgt implements LocatorAble{

    CONSTRAIN_DD_MENU("//div[text()='Constraint type']/following::p-dropdown"),

    // constraint types

    ASAP_TYPE(""),
    ALAP_TYPE(""),

    ;

    private String locator;

    ScheduleWgt(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
