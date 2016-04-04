package com.sorting;

import org.junit.Test;

import static com.sorting.Utils.printArray;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class HomeMergeSort {


    @Test
    public void testName() throws Exception {


        Integer[] integers = new Integer[]{1, 2, 3, 45, 2, 3, 1, 4, 5, 0};

        Comparable<Integer>[] integerComparable = new Comparable[integers.length];

        MergeSort mergeSort = new MergeSort();

        mergeSort.mergeSort(integers, 0, integers.length - 1, integerComparable);

        printArray(integers);
        System.out.println();

    }


    class MergeSort implements SortAlgorithm {


        private <T extends Comparable<T>> void mergeSort(Comparable[] unsortedArray, int start, int end, Comparable[] ts) {
            if (end <= start)
                return;

//            int mid = (end + start) / 2;
            int mid = start + (end - start) / 2;
//            int mid = lo + (hi - lo) / 2;


            mergeSort(unsortedArray, start, mid, ts);

            mergeSort(unsortedArray, mid + 1, end, ts);

            merge(ts, unsortedArray, start, mid, end);

        }

        private <T extends Comparable<T>> void merge(T[] aux, T[] unsortedArray, int start, int mid, int end) {


            copy(unsortedArray, aux, start, end);


            int index = start;
            int rightStart = mid + 1; //this is where the right begin index is !

            while (start <= mid && rightStart <= end) {

                if (aux[start].compareTo(aux[rightStart]) <= 0) {
                    unsortedArray[index] = aux[start++];
                } else {
                    unsortedArray[index] = aux[rightStart++];
                }
                index++;
            }


            while (start <= mid) {
                unsortedArray[index++] = aux[start++];
                index++;
            }


            while (rightStart < end) {
                unsortedArray[index++] = aux[rightStart++];
            }
        }


        private <T> void copy(T[] from, T[] into, int fromIndex, int toIndex) {

            if (into.length < from.length)
                throw new IllegalArgumentException();

            for (int i = fromIndex; i <= toIndex; i++) {
                into[i] = from[i];
            }


        }

        @Override
        public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
            Comparable[] comparables = new Comparable[unsortedArray.length];
            mergeSort(unsortedArray, 0, unsortedArray.length, comparables);
            return unsortedArray;
        }
    }

}


