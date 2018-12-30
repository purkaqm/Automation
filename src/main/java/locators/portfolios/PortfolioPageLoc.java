package locators.portfolios;

import locators.LocatorAble;

public enum PortfolioPageLoc implements LocatorAble {
    PORTFOLIO_PAGE_URL("person/Portfolios.epage"), // Portfolios dedicated page
    ADD_PORTFOLIO_BTN("//a[@id=\"AddPortfolioLink\"]/following::input"), // Add Portfolio button
    ACTION_MENU("//a[contains(text(),'" + SS + "')]//following::img[1]"),

    // Menu values locs:
    // View, Edit, Copy, Delete, Disable

    ACTION_MENU_VIEW("//td[contains(text(),'View')]"),
    ACTION_MENU_EDIT(""),
    ACTION_MENU_COPY(""),
    ACTION_MENU_DELETE("//td[contains(text(),'Delete')]"),
    ACTION_MENU_DISABLE(""),
    DELETE_BTN("//div[contains(@class,'Dialog')]//input[@value='Delete']"),
    CANCEL_BTN("//div[contains(@class,'Dialog')]//input[@value='Cancel']"),;

    PortfolioPageLoc(String locator) {
        this.locator = locator;
    }

    private String locator;

    @Override
    public String getLocator() {
        return locator;
    }

    // replace {} via the Portfolio Name

    public String getLocator(String portfolioName) {
        return this.getLocator().replace(SS, portfolioName);
    }
}
