package com.sorting;

import org.junit.Test;

import static com.sorting.Utils.printArray;
import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/16/15.
 */
public class KnuthIncrementSequenceShellSortTest {


    @Test
    public void sort() throws Exception {
        KnuthIncrementSequenceShellSort shellSort = new KnuthIncrementSequenceShellSort();
        Integer[] integers = new Integer[]{88, 51, 62, 13, 80, 91, 57, 26, 16, 76};
        shellSort.sort(integers);
        printArray(integers);


    }
}