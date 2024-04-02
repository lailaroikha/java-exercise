package com.adepuu.exercises.session8;

import java.util.UUID;

public class User {

    private UUID id;
    private String username;
    private String password;
    private String task;

    public User() {
        this.id = UUID.randomUUID();
        this.username = "";
        this.password = "";
    }

    public User(String username, String password, String task) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
    public boolean authenticate(String inputPassword)
    {
        return this.password.equals(inputPassword);
    }
}