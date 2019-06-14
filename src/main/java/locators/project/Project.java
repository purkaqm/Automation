package locators.project;

import locators.LocatorAble;

public enum Project implements LocatorAble {

    PROJECT_SUMMARY("project/Summary1.epage?sp=U"),
    PROJECT_TITLE_FLD("//h2[@id='project-summary-name']//div[@class='editable-field-wrapper']")
    ;

    String locator;

    Project(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
