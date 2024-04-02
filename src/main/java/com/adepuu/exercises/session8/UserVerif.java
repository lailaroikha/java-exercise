package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Map;

public class UserVerif {

    private Map<String, User> users;

    public UserVerif() {
        this.users = new HashMap<>();
    }

    public void addUser(User user) {
        this.users.put(user.getUsername(), user);
    }

    public boolean verify(String username, String password) {
        User user = this.users.get(username);
        if (user != null) {
            return user.authenticate(password);
        }
        return false;
    }
}