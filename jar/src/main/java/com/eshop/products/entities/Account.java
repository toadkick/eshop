package com.eshop.products.entities;

public class Account {

    private String login;
    private String phone;
    private String email;
    private String password;
    private String role;
    private int enabled;

    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_USER = "USER";

    public Account() {
    }

    public Account(String login, String phone, String email, String password) {
        this.login = login;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public Account(String login, String phone, String email) {
        this.login = login;
        this.phone = phone;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
