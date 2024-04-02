package com.adepuu.exercises.session11.stack;


public class LinkedListBasedStack<T> {
    private Node<T> top;
    private int size;

    public LinkedListBasedStack() {
        this.top = null;
        this.size = 0;
    }

    // Push operation
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop operation
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        T poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    // Peek operation
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get the size of the stack
    public int size() {
        return size;
    }
}