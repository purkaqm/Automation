package locators.configuration.tags;

import locators.LocatorAble;

public enum TagsListPageLoc implements LocatorAble {

    TAGS_GRID_PAGE_URL("admin/tags/TagSets.page"), // main URL

    // buttons

    ADD_NEW_TAG_BTN("//button[@id='AddTagSetShow']"),

    TAG_SET_NAME("//td[@class='nameColumnValue']//a[text()='" + SS + "']"),

    REMOVE_CHECKBOX("//following::img[@alt='Remove Tag'][1]"),

    YES_BTN("//input[@value='Yes']"),
    // tags


    // ====================   AddTag PopUp

    NAME_FLD("//input[@id='tagSetName']"),
    DESCRIPTION_FLD("//textarea[@id='tagSetDescription']"),
    SUBMIT_BTN("//input[@id='Submit']"),

    WORK_TYPE_FLD("//div[@id='workTypesDisp']"),
    WORK_TYPE_ITEM("//input[@name='" + SS + "']"),
    WORK_TYPE_DONE("//div[@doneid='workTypesDone']")

    ;

    TagsListPageLoc(String locator) {
        this.locator = locator;
    }

    String locator;

    @Override
    public String getLocator() {
        return locator;
    }

    public String getTagName(String tagName) {
        return TAG_SET_NAME.getLocator().replace(SS, tagName);
    }

    public String getWorkType(String workType) {
        return WORK_TYPE_ITEM.getLocator().replace(SS, workType);
    }
}
