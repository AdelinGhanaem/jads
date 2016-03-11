package com.sorting.fix;

import com.sorting.SortAlgorithm;

import static com.sorting.Utils.out;
import static com.sorting.Utils.swap;

/**
 * NOT WORKING ... !!!
 * Created by adelin.ghanayem@cayetanogaming.com on 3/9/16.
 */
public class DefaultInsertionSort implements SortAlgorithm {


    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {

        int swaps = 0;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            T tmp = unsortedArray[i + 1];
            for (int j = i ; j > 0; j--) {
                if (tmp.compareTo(unsortedArray[j]) < 0) {
                    swap(unsortedArray, i, j);
                }
            }
        }

        out(swaps + "\n");
        return unsortedArray;
    }
}
