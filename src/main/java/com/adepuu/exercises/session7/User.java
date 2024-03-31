package com.adepuu.exercises.session7;

import java.util.UUID;

public class User {
    private String name;
    private final String ID;
    private Ticket ticket;

    public User(String name) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.name = name;
    }

    public void saveTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getID() {
        return ID;
    }

    private Ticket getTicket() {
        return ticket;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

