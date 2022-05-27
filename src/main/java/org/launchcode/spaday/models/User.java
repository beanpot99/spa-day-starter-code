package org.launchcode.spaday.models;

public class User {
    private String username;
    private String email;
    private String password;
    private int id;
    private int nextId;
    public User(){
    id=nextId;
    nextId++;
    }
    public User(String username, String email, String password){
        this();
        this.email=email;
        this.username=username;
        this.password=password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getId() {
        return id;
    }
}
