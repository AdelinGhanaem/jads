package com.problems;

import com.sorting.QuickSort;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class MergeSort {

    private static <AnyType extends Comparable<? super AnyType>> int mergeSort(AnyType[] a, AnyType[] tmpArray, int left, int right) {

        if (left < right) {
            int center = (left + right) / 2;
            int leftInversions = mergeSort(a, tmpArray, left, center);
            int rightInversions = mergeSort(a, tmpArray, center + 1, right);
            int split = merge(a, tmpArray, left, center + 1, right);

            return leftInversions + rightInversions + split;
        }
        return 0;
    }

    public static <AnyType extends Comparable<? super AnyType>> int mergeSort(AnyType[] a) {
        AnyType[] tmpArray = (AnyType[]) new Comparable[a.length];
        return mergeSort(a, tmpArray, 0, a.length - 1);
    }


    private static <AnyType extends Comparable<? super AnyType>> int merge(AnyType[] a, AnyType[] tmpArray, int leftPos, int rightPos, int rightEnd) {

        int inversions = 0;
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
// Main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos].compareTo(a[rightPos]) <= 0) {
                tmpArray[tmpPos++] = a[leftPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
                inversions++;
            }
        }

// Copy rest of first half
        while (leftPos <= leftEnd) {
            inversions++;
            tmpArray[tmpPos++] = a[leftPos++];

        }


        while (rightPos <= rightEnd) {
            // Copy rest of right half
            tmpArray[tmpPos++] = a[rightPos++];

        }

// Copy tmpArray back
        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }

        return inversions;
    }
}
