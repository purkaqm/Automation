package objects;

import org.openqa.selenium.WebDriver;

public class User {

    WebDriver webDriver;

    private String userName;
    private String userID;

    public User(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
