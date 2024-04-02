package com.adepuu.exercises.session11;

public class LinkedListQueue {
        private Node front;
        private Node rear;
        private int size;

        public LinkedListQueue() {
            this.front = null;
            this.rear = null;
            this.size = 0;
        }

        private class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Cannot dequeue from an empty queue.");
            }
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return data;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Cannot peek at an empty queue.");
            }
            return front.data;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public static void main(String[] args) {
            LinkedListQueue queue = new LinkedListQueue();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            System.out.println("Peek: " + queue.peek());
            System.out.println("Dequeue: " + queue.dequeue());
            System.out.println("Dequeue: " + queue.dequeue());
            System.out.println("Enqueue: 5 (value, not return value of enqueue method)");
            queue.enqueue(5);
            System.out.println("Peek: " + queue.peek());
            System.out.println("Size: " + queue.size());
        }
    }
