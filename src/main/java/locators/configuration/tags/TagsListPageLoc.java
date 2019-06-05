package locators.configuration.tags;

import locators.LocatorAble;

public enum TagsListPageLoc implements LocatorAble {

    TAGS_GRID_PAGE_URL("admin/tags/TagSets.page"), // main URL

    // buttons

    ADD_NEW_TAG_BTN("//button[@id='AddTagSetShow']"),

    TAG_SET_NAME("//td[@class='nameColumnValue']//a[text()='" + SS + "']")

    // tags
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
}
