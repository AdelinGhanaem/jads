package com.sorting;

import java.util.Arrays;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/10/16.
 */
public class JavaSort extends AbstractSortTest {
    @Override
    protected SortAlgorithm create() {
        return new SortAlgorithm() {
            @Override
            public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
                Arrays.sort(unsortedArray);
                return unsortedArray;
            }
        };
    }




}
