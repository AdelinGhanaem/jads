package com.sorting;


public class MergeSort implements SortAlgorithm {


    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
        T[] tmp = (T[]) new Comparable[unsortedArray.length];
        mergeSort(tmp, unsortedArray, 0, unsortedArray.length - 1);
        return unsortedArray;

    }

    private static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] unsortedArray, AnyType[] tmpArray, int left, int right) {
        if (left < right) {

            int center = (left + right) / 2;
            System.out.println("Recursion: left: " + left + " center:" + center + " right:" + right);

            mergeSort(unsortedArray, tmpArray, left, center);
            mergeSort(unsortedArray, tmpArray, center + 1, right);
            merge(unsortedArray, tmpArray, left, center + 1, right);
        }
    }

    //the merge procedure time is liner O(N-1) => O(N)
    private static <AnyType extends Comparable<? super AnyType>> void merge(AnyType[] array, AnyType[] tmpArray, int start, int rightPos, int rightEnd) {
        //here we have 3 array the first on the tmp array, this is obvious.
        // the second and third is array[start-mid], array[mid+1-end ]

    }


}
