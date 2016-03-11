package com.sorting;

import com.sorting.fix.DefaultShellSort;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/10/16.
 */
public class DefaultShellSortTest extends AbstractSortTest {

    @Override
    protected SortAlgorithm create() {
        return new DefaultShellSort(10);
    }
}