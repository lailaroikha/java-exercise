package com.adepuu.exercises.session8;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    private UserVerif userVerif;
    private Scanner scanner;

    public Menu(UserVerif userVerif) {
        this.userVerif = userVerif;
        this.scanner = new Scanner(System.in);
    }

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void show() {
        System.out.println("===== ToDo App =====");
        System.out.println("1. Show ToDo List");
        System.out.println("2. Create ToDo List");
        System.out.println("3. Remove ToDo List");
        System.out.println("4. Logout");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showToDoList();
                break;
            case 2:
                createToDoList();
                break;
            case 3:
                removeToDoList();
                break;
            case 4:
                logout();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
    private UserVerif UserVerif;
    private Scanner scanner;
    private ArrayList<ToDoListItem> toDoList;

    public Menu(UserVerif userVerif) {
        this.UserVerif = userVerif;
        this.scanner = new Scanner(System.in);
        this.toDoList = new ArrayList<>();
    }
    private void showToDoList() {
        System.out.println("Your ToDo List:");
        // code to display the ToDo List
    }

    private void createToDoList() {
        System.out.print("Enter a task: ");
        String task = scanner.next();
        // code to create a new ToDo List item with the given task
    }

    private void removeToDoList() {
        System.out.print("Enter the index of the ToDo List item to remove: ");
        int index = scanner.nextInt();
        // code to remove the ToDo List item with the given index
        if (index >= 0 && index < toDoList.size()) {
            toDoList.remove(index);
            System.out.println("Item has been removed from to-do list.");
        } else {
            System.out.println("Invalid index.");
            }
    }
    private void logout() {
        System.out.println("Logging out...");
        // code to log out the user and clear any session data
    }

    private class ToDoListItem {
        private int id;
        private String task;

        public ToDoListItem(int id, String task) {
            this.id = id;
            this.task = task;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTask() {
            return task;
        }

        public void setTask(String task) {
            this.task = task;
        }
    }
    }

