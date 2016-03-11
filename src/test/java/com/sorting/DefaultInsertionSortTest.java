package com.sorting;

import com.sorting.fix.DefaultInsertionSort;
import org.junit.Test;

import static com.sorting.Utils.printArray;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/9/16.
 */
public class DefaultInsertionSortTest extends AbstractSortTest {


    @Override
    protected SortAlgorithm create() {
        return new DefaultInsertionSort();
    }


    @Test
    public void noSwapsWhenArrayIsSorted() throws Exception {



//        create().sort(create().sort(new Integer[]{2, 4, 6, 7, 8, 9, 1, 5}));

        printArray(create().sort(new Integer[]{2, 4, 6, 7, 8, 9, 1, 5}));

    }

}