package com.sorting.quicksort;

import org.junit.Test;

/**
 * For more information http://algs4.cs.princeton.edu/23quicksort/
 * Created by adelin.ghanayem@cayetanogaming.com on 9/1/15.
 */
public class QuickSortTest {


    @Test
    public void partitionProcedureTest() {

        Integer[] integers = new Integer[]{11, 18, 1, 20, 5, 12, 5, 16, 21, 16, 9, 13, 17, 3, 24, 15, 19};
//        partition(0, 1, integers.length - 1, integers);

        sort(integers, 0, integers.length - 1);

        for (int i : integers) {
            System.out.print(i + ",");

        }
    }


    private <T extends Comparable<T>> void sort(T[] array, int left, int right) {

        System.out.println("Recursive: left:" + left + ", right:" + right + " ");

        if (left >= right)
            return;

        int partitioner = partition(left, right, array);

        sort(array, left, partitioner);

        sort(array, partitioner + 1, right);

    }


    private <T extends Comparable<T>> int partition(int left, int right, T[] array) {


        int low = left;
        int high = right + 1;

        while (low <= high) {

            System.out.println("Partition: low:" + low + ", high:" + high);


            //PAY attention to the fact that ++low is different from low++ !!!! the loop will stop the the right index but just after the check it will increase it
            // it won't be ok anymore !
            while (array[++low].compareTo(array[left]) <= 0) // loop until you find an element smaller than the partitioner
                if (low == right) //however if low reached right this means that every thing is in place ( all element before partitioner are smaller than it )
                    break;

            while (array[--high].compareTo(array[left]) >= 0) // loop until you find and element greater than the partitioner
                if (high == left) // however if high reached left this mean everything is in place
                    break;


            /** The two items that stopped the scans are out of place in the final partitioned array,
             so we exchange them. When the scan indices cross, all that we need to do to complete
             the partitioning process is to exchange the partitioning item a[left] with the rightmost
             entry of the left subarray (a[high]) and return its index j.
             **/

            if (low < high)// if this is true no need to exchange the loop entered one more time to decrease high one more time and we don't exchange
                exchange(low, high, array);
        }

        // now here you need to exchange the first element - that is actually the partitioner - with high as high now is actually the place of the element
        exchange(high, left, array);

        System.out.println("next partitioner :" + high);
        return high;   // return the partitioner
    }

    private <T> void exchange(int firstIndex, int secondIndex, T[] ts) {
        T tmp = ts[firstIndex];
        ts[firstIndex] = ts[secondIndex];
        ts[secondIndex] = tmp;
    }

}