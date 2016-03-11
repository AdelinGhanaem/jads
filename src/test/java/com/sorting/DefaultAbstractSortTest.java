package com.sorting;

import com.sorting.fix.DefaultSelectionSort;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/9/16.
 */
public class DefaultAbstractSortTest extends AbstractSortTest {


    @Override
    protected SortAlgorithm create() {
        return new DefaultSelectionSort();
    }
}