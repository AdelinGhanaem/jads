package com.hackerrank.linkedlists;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/8/16.
 */
public class Utils {


    static void printList(Node node) {



        Scanner scanner;


        Node current = node;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("\n");
    }


    static Node toList(String s) {


        String[] numbers = s.split(" ");
        List<Short> list;
        if (numbers.length > 0) {
            Node head = new Node();
            head.data = Integer.valueOf(numbers[0]);

            Node current = head;
            for (int i = 1; i < numbers.length; i++) {
                Node node = new Node();
                node.data = Integer.valueOf(numbers[i]);
                current.next = node;
                current = node;
            }

            return head;
        }

        return null;

    }
}
