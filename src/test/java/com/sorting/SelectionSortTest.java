package com.sorting;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 8/6/15.
 */
public class SelectionSortTest {

    @Test
    public void shouldSortArray() throws Exception {


        Integer[] integer = new Integer[]{3, 4, 5, 2, 1, 0, 8,};

        SortAlgorithm selectionSort = new SelectionSort();

        selectionSort.sort(integer);
        assertThat(integer, equalTo(new Integer[]{0, 1, 2, 3, 4, 5, 8}));
        for (Integer i : integer) {
            System.out.println(i);
        }

    }


    @Test
    public void testWithLargArray() throws Exception {


        Integer[] integers = getRandomArray(100000);

        new SelectionSort().sort(integers);

        for (Integer i : integers) {
            System.out.println(i);
        }
    }

    private Integer[] getRandomArray(int size) {

        Random random = new Random(0);

        Integer[] integers = new Integer[size];

        for (int i = 0; i < size; i++) {
            integers[i] = random.nextInt(100) + 100;
        }

        return integers;

    }
}