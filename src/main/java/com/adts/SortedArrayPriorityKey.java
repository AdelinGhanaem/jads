package com.adts;

import static com.sorting.ArrayHelp.less;

/**
 * TODO: implement some test !
 * Created by adelin.ghanayem@cayetanogaming.com on 9/29/15.
 */
public class SortedArrayPriorityKey implements PriorityKey<Integer> {


    Integer[] array;
    private int size;

    public SortedArrayPriorityKey() {
        array = new Integer[10];
        System.out.print(array.length);
    }

    @Override
    public Integer getMax() {
        return array[size];
    }

    @Override
    public void insert(Integer key) {


        if (size == array.length)
            resize();
        if (size / 4 == array.length)
            shrink();

        int i = size - 1;

        while (i >= 0 && less(key, array[i])) {
            array[i + 1] = array[i];
            i--;
        }

        int lastIndex = i + 1;
        array[lastIndex] = key;
        size++;

    }


    private void shrink() {
        Integer[] integers = new Integer[size / 2];
        System.arraycopy(array, 0, integers, 0, integers.length);
        array = integers;
    }

    private void resize() {
        Integer[] integers = new Integer[size * 2];
        System.arraycopy(array, 0, integers, 0, integers.length);
        array = integers;
    }

    @Override
    public Integer delMax() {
        int max = array[size];
        array[size] = null;
        size--;
        return max;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
