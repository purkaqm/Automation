package objects.project;

import pages.Page;
import pages.exception.NotLoggedInException;

public class OwnerShipDialog extends Page{

    private String owner;

    public OwnerShipDialog(String owner) {
        this.owner = owner;
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() throws NotLoggedInException {
        return false;
    }
}
