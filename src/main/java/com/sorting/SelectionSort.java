package com.sorting;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 8/6/15.
 */
public class SelectionSort implements SortAlgorithm {


    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {

        if (unsortedArray == null) {
            return null;
        }

        if (unsortedArray.length == 0 || unsortedArray.length == 1) {
            return unsortedArray;
        }

        int i = 0;
        while (i < unsortedArray.length - 1) {
            int minIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j].compareTo(unsortedArray[minIndex]) < 0) {
                    minIndex = j;
                }

            }
            swap(unsortedArray, i, minIndex);
            i++;
        }
        return unsortedArray;
    }


    private <T> void swap(T[] array, int firstIndex, int secondIndex) {
        T tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
