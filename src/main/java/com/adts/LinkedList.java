package com.adts;

import java.io.PrintStream;

/**
 * Created by adelin on 14-8-21.
 */
public class LinkedList<T> implements List<T> {


    private Node<T> first;


    @Override
    public T get(int index) {

        if (index == 0) {

            if (first == null) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return first.getValue();
        }

        int counter = 0;

        Node<T> current = first;

        while (counter < index) {

            if (!current.hasNext()) {
                throw new ArrayIndexOutOfBoundsException("array size is " + current + ". Trying to execute " + index + " element");
            }
            current = current.getNext();
            counter++;
        }

        return current.getValue();

    }

    @Override
    public void printList(PrintStream stream) {

    }

    @Override
    public void add(T element) {
        if (first == null) {
            first = new Node<T>(element, null, null);
        } else {
            addNext(first, element);
        }
    }

    @Override
    public void add(int position, T element) {
        insert(element, position, 0, first);
    }


    private void insert(T element, int position, int counter, Node<T> next) {


        if (counter == position) {
            if (next != null) {
                if (!next.hasNext()) {
                    next.setNext(new Node<T>(element, null, next));
                } else {
                    next.setNext(new Node<T>(element, next.getNext(), next));
                }

            }
        } else {
            if (next == null) {
                throw new ArrayIndexOutOfBoundsException();
            }
            counter++;
            insert(element, position, counter, next.getNext());

        }

    }


    private void addNext(Node<T> current, T element) {

        if (current.hasNext()) {
            addNext(current.getNext(), element);
        } else {
            current.setNext(new Node<T>(element, null, current));
        }
    }

}
