package com.abc.binarysearch;


public class Node {
    Student student;
    Node left, right;

    // Constructor
    public Node(Student student) {
        this.student = student;
        left = right = null;
    }
}
