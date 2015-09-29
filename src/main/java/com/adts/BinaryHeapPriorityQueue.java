package com.adts;

import static com.sorting.ArrayHelp.exch;
import static com.sorting.ArrayHelp.less;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/28/15.
 */
public class BinaryHeapPriorityQueue implements PriorityKey<Integer> {


    int[] array;
    private int size = 1;

    BinaryHeapPriorityQueue() {
        array = new int[11];
    }

    @Override
    public Integer getMax() {
        return array[1];
    }

    @Override
    public void insert(Integer key) {
        array[size] = key;
        int index = size;

        while (index > 1 && less(key,array[index])) {
            exch(array, index / 2, index);
            index = index / 2;
        }
//        exch(array, index, size);
        size++;
    }

    @Override
    public Integer delMax() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
