package com.heap;


public interface PriorityQueue<Key extends Comparable<Key>> {


    public void insert(Key key);

    public Key delMax();

    public boolean isEmpty();

    public Key max();

    public int size();

}



