package com.sorting.fix;

import com.sorting.SortAlgorithm;

import static com.sorting.Utils.out;
import static com.sorting.Utils.printArray;
import static com.sorting.Utils.swap;

/**
 *
 * Created by adelin.ghanayem@cayetanogaming.com on 3/9/16.
 */
public class DefaultSelectionSort implements SortAlgorithm {


    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {

        boolean hasChanged = false;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int minIndex = i; // every time the min index is at i-th position ...
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[minIndex].compareTo(unsortedArray[j]) > 0) {
                    minIndex = j;
                }
            }
            printArray(unsortedArray);
            System.out.print(" [ i: " + i + " min: " + minIndex + "] \n");
            swap(unsortedArray, minIndex, i);

        }

        printArray(unsortedArray);
        out("\n");
        return unsortedArray;

    }


}
