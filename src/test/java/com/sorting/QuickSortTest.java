package com.sorting;

import com.sorting.quicksort.*;
import com.sorting.quicksort.QuickSort;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 7/24/15.
 */
public class QuickSortTest extends AbstractSortTest {


    @Override
    protected SortAlgorithm create() {
        return new QuickSort();
    }


}