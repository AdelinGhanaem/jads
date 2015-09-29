package com.sorting;


public class MergeSort implements SortAlgorithm {


    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
        T[] tmp = (T[]) new Comparable[unsortedArray.length];
        return mergeSort(tmp, unsortedArray, 0, unsortedArray.length - 1);

    }

    private <T extends Comparable<? super T>> T[] mergeSort(T[] tempArray, T[] arrayToBeSort, int left, int right) {
        if (left < right) {

            int center = (left + right) / 2;

            mergeSort(tempArray, arrayToBeSort, left, center);

            mergeSort(tempArray, arrayToBeSort, center + 1, right);

            return merge(tempArray, arrayToBeSort, left, center, right);

        }
        return tempArray;
    }

    private <T extends Comparable<? super T>> T[] merge(T[] tempArray, T[] array, int left, int center, int right) {
        System.out.print("=====================================================\n");
        System.out.println("Initialize: left: " + left + " center: " + center + " right:" + right);
        printArray(tempArray);
        printArray(array);

        int rightCursor = center + 1;
        int tempCursor = left;

        while (left <= center && rightCursor <= right) {
            if (array[left].compareTo(array[rightCursor]) <= 0) {
                tempArray[tempCursor] = array[left];
                left++;
            } else {
                tempArray[tempCursor] = array[rightCursor];
                rightCursor++;
            }
            tempCursor++;
        }
        printArray(tempArray);
        printArray(array);
        System.out.print("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& \n");
        return null;
    }

    public static <T> void printArray(T[] ts) {
        for (T t : ts) {
//            System.out.print("[" + t + "]");
        }
        for (T t : ts) {
            System.out.print(t + " ");
        }
        System.out.println();
    }


}
