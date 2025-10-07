package org.example;

public class User {
    public MyWebsite getWebsite() {
        return website;
    }

    public void setWebsite(MyWebsite website) {
        this.website = website;
    }

    MyWebsite website;

    void access(){
        website.login();
        website.provide();
    }
}
