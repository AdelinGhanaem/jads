package com.sorting;

import org.junit.Test;

import java.util.Arrays;

import static com.sorting.Utils.getRandomArray;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 8/6/15.
 */
public abstract class AbstractSortTest {


    SortAlgorithm sortAlgorithm = create();

    protected abstract SortAlgorithm create();


    @Test
    public void shouldSortArray() throws Exception {


        Integer[] integers = new Integer[]{115, 119, 129, 147, 153, 148, 154, 160, 161, 191};
        Integer[] integers2 = getRandomArray(10);

        sortAlgorithm.sort(integers);
//        assertThat(integer, equalTo(new Integer[]{0, 1, 2, 3, 4, 5, 8}));
        for (Integer i : integers) {
            System.out.println(i);
        }

        System.out.println("----------------------------");


        sortAlgorithm.sort(integers2);
//        assertThat(integer, equalTo(new Integer[]{0, 1, 2, 3, 4, 5, 8}));
        for (Integer i : integers2) {
            System.out.println(i);
        }

        System.out.println("----------------------------");


    }


    @Test
    public void testWithLargArray() throws Exception {
        for (int i = 0; i * 2 < 1000; i++) {
            test(i);
        }
    }

    private void test(int size) {
        Integer[] integers = getRandomArray(size);

        sortAlgorithm.sort(integers);

        Integer[] expected = Arrays.copyOf(integers, integers.length);

        Arrays.sort(expected);

        assertThat(integers, is(equalTo(expected)));
//
//        for (Integer i : integers) {
//            System.out.println(i);
//        }
    }


}