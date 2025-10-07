package org.example;

public class MyService {
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private String user;
    public void provide(){
        System.out.println(user + " Your Service provided");
    }
}
