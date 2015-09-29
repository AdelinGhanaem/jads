package com.sorting;

import javafx.scene.control.SortEvent;
import org.junit.Test;

import static com.sorting.MergeSort.printArray;
import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 8/18/15.
 */
public class MergeSortTest {


    @Test
    public void simpleTest() {

        SortAlgorithm algorithm = new MergeSort();

        Integer[] integers = new Integer[]{4, 2, 3, 6, 7, 5, 1, -1};

        algorithm.sort(integers);

        for (int i : integers) {
            System.out.print(i);
        }

    }

    @Test
    public void mergeMethod() {

        Integer[] integers = new Integer[]{2, 4, 8, 3, 6, 7};
        Comparable[] comparables = new Comparable[6];
        mergeSort(integers);

        printArray(integers);
    }

    public static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a) {
        AnyType[] tmpArray = (AnyType[]) new Comparable[a.length];
        mergeSort(a, tmpArray, 0, a.length - 1);
    }

    private static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a, AnyType[] tmpArray, int left, int right) {
        if (left < right) {

            int center = (left + right) / 2;
            System.out.println("Recursion: left: " + left + " center:" + center + " right:" + right);

            mergeSort(a, tmpArray, left, center);
            mergeSort(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }

    private static <AnyType extends Comparable<? super AnyType>> void merge(AnyType[] array, AnyType[] tmpArray, int leftPos, int rightPos, int rightEnd) {
//        System.out.println("merge: leftPos: " + leftPos + " rightPos:" + rightPos + " rightEnd:" + rightEnd);

        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
// Main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd)
            if (array[leftPos].compareTo(array[rightPos]) <= 0)
                tmpArray[tmpPos++] = array[leftPos++];
            else
                tmpArray[tmpPos++] = array[rightPos++];
        while (leftPos <= leftEnd)
// Copy rest of first half
            tmpArray[tmpPos++] = array[leftPos++];
        while (rightPos <= rightEnd) // Copy rest of right half
            tmpArray[tmpPos++] = array[rightPos++];
// Copy tmpArray back
        for (int i = 0; i < numElements; i++, rightEnd--)
            array[rightEnd] = tmpArray[rightEnd];
    }

//    private <T extends Comparable<? super T>> T[] merge(T[] tempArray, T[] array, int left, int center, int right) {
//        System.out.print("=====================================================\n");
//        System.out.println("Initialize: left: " + left + " center: " + center + " right:" + right);
//        printArray(tempArray);
//        printArray(array);
//
//        int rightCursor = center + 1;
//        int tempCursor = left;
//
//        while (left <= center && rightCursor <= right) {
//            if (array[left].compareTo(array[rightCursor]) <= 0) {
//                tempArray[tempCursor] = array[left];
//                left++;
//            } else {
//                tempArray[tempCursor] = array[rightCursor];
//                rightCursor++;
//            }
//            tempCursor++;
//        }
//
//
//        while (left <= center) {
//            tempArray[tempCursor] = array[left];
//            tempCursor++;
//            left++;
//        }
//        while (rightCursor <= right) {
//            tempArray[tempCursor] = array[rightCursor];
//            tempCursor++;
//            rightCursor++;
//        }
//
//
//        printArray(tempArray);
//        printArray(array);
//        System.out.print("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& \n");
//        return null;
//    }
}