package com.adepuu.exercises.session11.binarysearchtree;

public class BinarySearchTree {
    //menambah not baru
    public  Node root;

    //objek dari kelas bernama Node

    public void addNote(Node node) {
        if (root==null){
            root=node;

        }
        else {
            insertNode(root, node);

        }
    }
    public void insertNode(Node parent, Node node){
        if (parent.getValue() > node.getValue()){ //
            if (parent.leftChild==null){
                parent.leftChild=node;
            }
            else
            {
                insertNode(parent.leftChild, node);
            }
        }
        else
        {
            if (parent.rightChild == null){
                parent.rightChild =node;
            }
            else
            {
                insertNode(parent.rightChild, node);
            }
        }
    }
    //untuk mengeluarkan true or false untuk melihat ada di binary tree
    public static boolean searchValue(Node root, int value) {
        if (root == null) {
            return false;
        } else {
            if (root.getValue() == value) {
                return true;
            }
            else if (root.getValue() > value ){
                return searchValue(root.leftChild, value);
            }
            else
            {
                return searchValue(root.rightChild, value);
            }
        }
    }
}
