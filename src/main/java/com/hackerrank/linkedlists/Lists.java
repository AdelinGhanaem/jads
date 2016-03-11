package com.hackerrank.linkedlists;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/8/16.
 */
public class Lists {


    /**
     * Reverse a linked list provided its head
     *
     * @param head
     * @return
     */
    public static Node revers(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = revers(head.next); // reverse all but first
        head.next.next = head; // make original second point at first
        head.next = null; // make original first point at nothing

        return newHead;

    }

}
