package org.example;

import java.util.Scanner;

public class Oauth implements Authontication{

    public GoogleOauth getGoogleOauth() {
        return googleOauth;
    }

    public void setGoogleOauth(GoogleOauth googleOauth) {
        this.googleOauth = googleOauth;
    }

    GoogleOauth googleOauth;
    Scanner sc = new Scanner(System.in);
    @Override
    public boolean loginUser() {
        String email;
        System.out.println("Enter email");
        email = sc.next();

        return googleOauth.provideOauth(email);
    }

    @Override
    public void logOutUser() {

    }
}
