package com.adts;

import java.io.PrintStream;

/**
 * Notes: Deletions and insertions are potential expensive operation of array list.
 *
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class SimpleArrayList<T> implements List<T> {


    private static final int INITIAL_SIZE = 10;

    private final Object lock = new Object();

    private int currentPosition;

    private Object[] objects = new Object[INITIAL_SIZE];

    @Override
    public T get(int index) { // takes a constant time to get the i-th element.
        synchronized (lock) {
            return (T) objects[index];
        }

    }

    @Override
    public void printList(PrintStream stream) {
        //takes a liner time O(N) to print the array list to the print stream
        for (Object each : objects) {
            stream.println(each);
        }

    }

    @Override
    public void add(T element) {

    }

    @Override
    public void add(int position, T element) {


    }


}
