package locators.common;

import locators.LocatorAble;

public enum ExportList implements LocatorAble {

    EXCEL_LNK("//span[text()='Excel']"),
    CSV_LNK("//span[text()='CSV']"),
    PDF_LNK("//span[text()='PDF']"),;

    private String locator;

    ExportList(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }
}
