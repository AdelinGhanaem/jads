package com.hackerrank;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/29/16.
 */
public class Node {


    Node left;
    Node right;
    int data;


    public Node(int data, Node left, Node right) {
        this.left = left;
        this.right = right;
        this.data = data;
    }


    @Override
    public String toString() {
        return String.valueOf(data);
    }

    public Node() {
    }

    static Node tree() {
        return new Node(4, new Node(2, new Node(1, null, null), new Node(3, null, null)), new Node(7, new Node(6, null, null), null));
    }
}
