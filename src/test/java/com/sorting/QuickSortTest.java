package com.sorting;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 7/24/15.
 */
public class QuickSortTest {


    @Test
    public void testPartition() {
        QuickSort quickSort = new QuickSort();
        Integer[] integers = new Integer[]{3, 8, 2, 5, 1, 4, 7, 6};
        quickSort.sort(integers);
        Utils.printArray(integers);
        System.out.println("\n");
    }

}