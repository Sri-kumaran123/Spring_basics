package org.example;

public class GoogleOauth {
    String email;
    boolean provideOauth(String email){
        this.email = email;
        return true;
    }

    boolean provideOauth(){
        return false;
    }
}
