package com.hackerrank.lists;

import static com.hackerrank.lists.Utils.printList;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class RemoveElementAtIndex {


    public static void main(String[] args) {


        Node node = new Node(4, new Node(3, new Node(2, new Node(5, new Node(1, null)))));
        Node head = Delete(node, 2);

        printList(head);

    }


    static Node Delete(Node head, int position) {

        if (position == 0)
            if (head == null)
                return null;
            else {
                head = head.next;
                return head;
            }


        int counter = 0;
        Node beforeRemove = head;

        while (counter < position - 1) {
            beforeRemove = head.next;
            counter++;
        }

        if (beforeRemove.next != null)
            beforeRemove.next = beforeRemove.next.next;

        return head;


    }
}
