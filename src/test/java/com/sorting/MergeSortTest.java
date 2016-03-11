package com.sorting;

import javafx.scene.control.SortEvent;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 8/18/15.
 */
public class MergeSortTest extends AbstractSortTest {
    @Override
    protected SortAlgorithm create() {
        return new MergeSort();
    }


//    @Test
//    public void simpleTest() {
//
//        SortAlgorithm algorithm = new MergeSort();
//
//        Integer[] integers = new Integer[]{4, 2, 3, 6, 7, 5, 1, -1};
//
//        algorithm.sort(integers);
//
//        for (int i : integers) {
//            System.out.print(i);
//        }
//
//    }

//    @Test
//    public void mergeMethod() {
//
//        Integer[] integers = new Integer[]{2, 4, 8, 3, 6, 7};
//        mergeSort(integers);
//
//        printArray(integers);
//    }
//
//    public static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a) {
//        AnyType[] tmpArray = (AnyType[]) new Comparable[a.length];
//        mergeSort(a, tmpArray, 0, a.length - 1);
//    }
//
//
//    @Override
//    protected SortAlgorithm create() {
//        return new MergeSort();
//    }

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