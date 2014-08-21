package com.adts;

/**
 *
 * Created by adelin on 14-8-21.
 */
public class Node<T> {


    private T value;

    private Node<T> next;
    private Node<T> previous;


    public Node(T value, Node<T> next, Node<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }


    public Node<T> getPrevious() {
        return previous;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public boolean hasNext(){
        return next !=null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
