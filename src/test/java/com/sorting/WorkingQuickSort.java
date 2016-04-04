package com.sorting;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/11/16.
 */
public class WorkingQuickSort extends AbstractSortTest {


    @Override
    protected SortAlgorithm create() {
        return new SortAlgorithm() {

            //this algorithm uses the first element as a partition
            //there are a couple of versions of quick sort.
            @Override
            public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
                return null;
            }
        };
    }
}
