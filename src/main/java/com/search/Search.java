package com.search;

import java.util.Collection;
import java.util.List;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/22/16.
 */
public interface Search<T extends Comparable<T>> {


    /**
     *
     * @param collection
     * @param element
     * @return the index of element if found -1 otherwise
     */
    int search(List<T> collection, T element);

    /**
     *
     * @param collection
     * @param element
     * @return the index of element if found -1 otherwise
     */
    int search(T[] collection, T element);


}
