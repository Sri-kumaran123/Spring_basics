package org.example;

import java.util.Scanner;

public class EmailAndPassword implements Authontication{

    private String email;
    private String password;
    Scanner sc = new Scanner(System.in);
    @Override
    public boolean loginUser() {
        System.out.println("Enter User email");
        email = sc.next();
        System.out.println("Enter Password");
        password = sc.next();
        return true;
    }

    @Override
    public void logOutUser() {
        System.out.println("Logout");
        email="";
        password="";
    }
}
