package com;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Map;


class Address {
    public int solution(int[] A) {

        Node root=null;

        for(int i=0;i<A.length;i++){
            insert(root,A[i]);
        }

        return mostFrequent(root,0);


    }

    static int mostFrequent(Node root,int mostFrequent){

        if(root==null)
            return 0;

        if(mostFrequent>root.frequency){
            int left =  mostFrequent(root.left,mostFrequent);
            int right =   mostFrequent(root.right,mostFrequent);

            return left > right ? (left> mostFrequent ? left:mostFrequent ) : ( right > mostFrequent ? right:mostFrequent) ;
        }else{
            int left =  mostFrequent(root.left,root.frequency);
            int right =   mostFrequent(root.right,root.frequency);
            return left > right ? (left> mostFrequent ? left:mostFrequent ) :  ( right > mostFrequent ? right:mostFrequent);
        }


    }


    static class Node {

        int value;
        int frequency;
        Node right;
        Node left;

        public Node(int value, Node right, Node left){

            this.value = value;
            this.right= right;
            this.left = left;
        }

    }


    private static void insert(Node root, int value){

        if(root == null)
            root = new Node(value,null,null);

        if(root.value == value){
            root.frequency++;
        }

        if(root.value > value){
            insert(root.left,value);
        }

        if(root.value < value){
            insert(root.right,value);
        }


    }



}