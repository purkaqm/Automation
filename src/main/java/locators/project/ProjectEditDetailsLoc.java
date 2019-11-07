package locators.project;


import locators.LocatorAble;

public enum ProjectEditDetailsLoc implements LocatorAble{

    // buttons

    SAVE_ALL_BTN("//button[@title='Save All']"),
    CANCEL_BTN("//button[@title='Save All']//following::button[text()='Cancel']"),

    ;

    private String locator;

    ProjectEditDetailsLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }


}
