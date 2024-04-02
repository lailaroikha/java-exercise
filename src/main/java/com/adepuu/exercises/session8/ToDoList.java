package com.adepuu.exercises.session8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ToDoList {
    private List<ToDoItem> todoItems;
    private UUID id;
    private String name;
    private LocalDate dueDate;

    public ToDoList() {
        this.id = UUID.randomUUID();
        this.todoItems = new ArrayList<>();
    }

    public ToDoList(String name, LocalDate dueDate) {
        this.id = UUID.randomUUID();
        this.todoItems = new ArrayList<>();
        this.name = name;
        this.dueDate = dueDate;
    }

    public void addTodoItem(ToDoItem item) {
        this.todoItems.add(item);
    }

    public void removeTodoItem(UUID itemId) {
        this.todoItems.removeIf(item -> item.getId().equals(itemId));
    }

    public List<ToDoItem> getTodoItems() {
        return todoItems;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public static ToDoList parseFromString(String string) {
        String[] parts = string.split(",");
        UUID id = UUID.fromString(parts[0].trim());
        String name = parts[1].trim();
        String dueDateString = parts[2].trim();
        LocalDate dueDate = LocalDate.parse(dueDateString, DateTimeFormatter.ISO_DATE);

        ToDoList list = new ToDoList(name, dueDate);
        list.getId(id);

        for (int i = 3; i < parts.length; i++) {
            String itemString = parts[i].trim();
            ToDoItem item = ToDoItem.parseFromString(itemString);
            list.addTodoItem(item);
        }

        return list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(",").append(name).append(",").append(dueDate.format(DateTimeFormatter.ISO_DATE));

        for (ToDoItem item : todoItems) {
            builder.append(",").append(item.toString());
        }

        return builder.toString();
    }
}

class ToDoItem {
    private UUID id;
    private String description;
    private boolean completed;

    public ToDoItem(String description, boolean completed) {
        this.id = UUID.randomUUID();
        this.description = description;
        this.completed = completed;
    }

    public static ToDoItem parseFromString(String string) {
        String[] parts = string.split(";");
        UUID id = UUID.fromString(parts[0].trim());
        String description = parts[1].trim();
        boolean completed = Boolean.parseBoolean(parts[2].trim());

        return new ToDoItem(description, completed);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return id + ";" + description + ";" + completed;
    }
}
