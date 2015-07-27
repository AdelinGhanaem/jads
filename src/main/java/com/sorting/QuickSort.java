package com.sorting;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 7/24/15.
 */
public class QuickSort implements SortAlgorithm {


    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {

        partition(0, unsortedArray.length - 1, unsortedArray);
        return null;
    }


    private <T extends Comparable<? super T>> void partition(int start, int end, T[] array) {


        if (end - start > 1) {
            //this is if the pivot is 0
            int i = start + 1;
            int j = start + 2;

            while (j < end) {
                if (array[j].compareTo(array[end]) < 0) {//less than
                    swap(j, i, array);
                    i++;
                }
                j++;
            }

            swap(i - 1, end, array);

            partition(start, i - 1, array);
            partition(i + 1, array.length - 1, array);
            Utils.printArray(array);
            System.out.println("\n______");
        }

    }


    private <T> void swap(int pos1, int pos2, T[] array) {

        T temp = array[pos1];

        array[pos1] = array[pos2];

        array[pos2] = temp;

    }

}
