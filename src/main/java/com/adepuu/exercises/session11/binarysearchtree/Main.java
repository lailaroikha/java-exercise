package com.adepuu.exercises.session11.binarysearchtree;

public class Main { //for implementation
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.addNote(new Node (5));
        bt.addNote(new Node (4));
        bt.addNote(new Node (6));
        bt.addNote(new Node (7));
        bt.addNote(new Node (8));
        System.out.println(BinarySearchTree.searchValue(bt.root,6));
    }
}
