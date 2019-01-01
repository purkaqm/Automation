package locators.dashboard;

import locators.LocatorAble;

public enum DashboardGridLoc implements LocatorAble {
    DASHBOARD_GRID_URL("person/Dashboard.epage"),
    PORTFOLIO_MENU("//select[@id='DashboardToolbarId_LeftPortfolioSelector']"),
    //PORTFOLIO_MENU_2("//select[@id='DashboardToolbarId_RightPortfolioSelector']"),
    PORTFOLIO_MENU_2("//span[contains(text(),'Select a portfolio')]"),

    LAYOUT_MENU("//select[@id='DashboardToolbarId_LayoutSelector']"),
    GO_BTN("//input[@dojoattachevent='onclick:goButtonHandler']"),

    PORTFOLIO("//select[@id='DashboardToolbarId_LeftPortfolioSelector']//option[@title='" + SS + "']"),
    PORTFOLIO2("//select[@id='DashboardToolbarId_RightPortfolioSelector']//option[@title='" + SS + "']"),
    LAYOUT("//select[@id='DashboardToolbarId_LayoutSelector']//option[@title='" + CC + "']"),
    PORTFOLIO_COMPARE_BTN("//div[@class='compareBtn']"),;


    private String locator;


    DashboardGridLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    public String getLocator(String portfolioName) {
        return PORTFOLIO.getLocator().replace(SS, portfolioName);
    }

    public String getLocator2(String layoutName) {
        return LAYOUT.getLocator().replace(CC, layoutName);
    }

    public String getLocator3(String portfolioName) {
        return PORTFOLIO2.getLocator().replace(SS, portfolioName);
    }
}
