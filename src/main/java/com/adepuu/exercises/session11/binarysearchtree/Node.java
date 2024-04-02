package com.adepuu.exercises.session11.binarysearchtree;

public class Node {         //for make a value form element in binary tree
    private int value; // menggunakan value dalam bentuk integer dengan modifier privite
    public Node leftChild; //public dapat di akses dimana saja
    public Node rightChild;

    //membuat contracter Node
    Node(int value){
    this.value = value;
    }
    //membuat get method untuk mengeluarkan nilai dari kelas itu sendiri (karena value menggunakan private)
    public int getValue() {
        return value;
    }
}
