package com.hackerrank.lists;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Utils {


    static void printList(Node head) {


        Node next = head;
        while (next != null) {
            System.out.print(next.data + " -> ");
            next = next.next;
        }


    }
}
