package com.sorting;


import jdk.nashorn.tools.Shell;
import org.junit.Test;

import static com.sorting.MergeSort.printArray;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class ShellSortTest {


    @Test
    public void sort() throws Exception {
        ShellSort shellSort = new ShellSort();
        Integer[] integers = new Integer[]{3, 4, 5, 6, 4, 3, 6, 7, 8, 9, 2, 3, 4, 1, 0, 6};
        shellSort.sort(integers);
        printArray(integers);


    }
}
