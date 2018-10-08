package pages;

import pages.exception.NotLoggedInException;

public interface PageObject {

    String pageTitle();

    boolean pageIsOpened() throws NotLoggedInException;
}
