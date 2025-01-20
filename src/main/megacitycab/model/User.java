package com.megacitycab.model;

public class User {
    private String nic;
    private String phone;
    private String username;
    private String password;

    public User(String nic, String phone, String username, String password) {
        this.nic = nic;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
