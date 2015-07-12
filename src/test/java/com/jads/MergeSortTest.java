package com.jads;

import org.junit.Test;

public class MergeSortTest {


    @Test
    public void shouldSortArray() {
        int[] a = new int[]{2, 4, 5, 6, 3, 2, 1};


        mergerSort(a, 0, a.length);
        for (int anA : a) {
            System.out.println(anA);
        }


    }


    public void mergerSort(int[] ts, int start, int end) {

        if (ts == null) {
            return;
        }

        if (start < end ) {
            int pivot = (end +start) / 2;
            mergerSort(ts, start, pivot);
            mergerSort(ts, pivot + 1, end);
            merge(ts, start, end, pivot+1);
        }
    }

    private void merge(int[] ts, int start, int end, int pivot) {

        while (start <= pivot && end < pivot) {

            if (ts[start] > ts[end]) {
//                tmp[start]
                start++;
            } else {
                end--;
            }
        }
    }


    private void changeValue(int[] ts, int firstIndex, int secondIndex) {
        int tmp = ts[firstIndex];
        ts[firstIndex] = ts[secondIndex];
        ts[secondIndex] = tmp;
    }

}