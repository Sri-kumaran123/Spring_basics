package org.example;

public class MyWebsite {

    public Authontication getAuth() {
        return auth;
    }

    public void setAuth(Authontication auth) {
        this.auth = auth;
    }

    Authontication auth;
    private boolean checkAuth;

    public MyService getService() {
        return service;
    }

    public void setService(MyService service) {
        this.service = service;
    }

    MyService service;

    MyWebsite(boolean defaultValue){
        checkAuth = defaultValue;
    }

    void login(){
        checkAuth = auth.loginUser();
        if(checkAuth){
            System.out.println("Your Authenticated");
        }
        else {
            System.out.println("Login again");
        }
    }

    void provide(){
        if(checkAuth){
            service.provide();
        } else {
            System.out.println("Cannot Provide Services");
        }
    }
}
