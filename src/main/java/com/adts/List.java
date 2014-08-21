package com.adts;

import java.io.PrintStream;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public interface List<T> {


    /**
     * Returns the element resides in the i-th position;
     *
     * @param index the elements index
     * @return the element based on index-position
     */
    T get(int index);


    /**
     * Prints and array list to the provided print stream.
     *
     * @param stream
     */
    void printList(PrintStream stream);


    /**
     * Adds and element to the list
     * @param element   the element to be added
     */
    void add(T element);

    /**
     * Adds an element at the provided position ...
     * @param position
     * @param element
     */
    void add(int position, T element);
}
