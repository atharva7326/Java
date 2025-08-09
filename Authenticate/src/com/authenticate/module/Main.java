package com.authenticate.module;
abstract class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    abstract boolean authenticate();
}


class Admin extends User {
    Admin(String username, String password) {
        super(username, password);
    }

    @Override
    boolean authenticate() {
     
        return username.equals("admin") && password.equals("admin123");
    }
}


class GeneralUser extends User {
    GeneralUser(String username, String password) {
        super(username, password);
    }

    @Override
    boolean authenticate() {
        
        return username.equals("user") && password.equals("user123");
    }
}


public class Main {
    public static void main(String[] args) {
        User admin = new Admin("admin", "admin123");
        User user = new GeneralUser("user", "user123");

        System.out.println("Admin Authenticated: " + admin.authenticate());
        System.out.println("User Authenticated: " + user.authenticate());
    }
}
