package com.adts;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/29/15.
 */
public interface PriorityKey<Key extends Comparable<Key>> {


    /**
     * Returns the max key
     * @return
     */
    Key getMax();

    /**
     * Inserts a key into the queue
     * @param key
     */
    void insert(Key key);

    /**
     * Returns the max keys before it deletes it
     * @return
     */
    Key delMax();

    /**
     *
     * @return
     */
    boolean isEmpty();

    /**
     * Returns the size of
     * @return
     */
    int size();


}
