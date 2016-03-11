package com.sorting.fix;

import com.sorting.SortAlgorithm;

import static com.sorting.Utils.swap;

/**
 * //NOT WORKING
 * Shell sort O(N^2/3)
 * Created by adelin.ghanayem@cayetanogaming.com on 3/10/16.
 */
public class DefaultShellSort implements SortAlgorithm {

    private int maxDistance;

    public DefaultShellSort(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {


        //this shell sort is not correct, correct it !
        for (int d = maxDistance; d > 0; d--) {

            for (int i = 0; i < (unsortedArray.length / d) - 1; i += d) {
                T tmp = unsortedArray[i];
                for (int j = i+d; j < unsortedArray.length / d; j += d) {
                    if (tmp.compareTo(unsortedArray[j]) > 0) {
                        swap(unsortedArray, i, j);
                    }
                }
            }
        }
        return unsortedArray;
    }
}
