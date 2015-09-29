package com.adts;

import org.junit.Test;

import java.util.Random;

import static com.sorting.MergeSort.printArray;
import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/29/15.
 */
public class SortedArrayPriorityKeyTest {


    @Test
    public void test() {
        Random random = new Random();
        SortedArrayPriorityKey sortedArrayPriorityKey = new SortedArrayPriorityKey();
        for (int i = 0; i < 10; i++) {
            sortedArrayPriorityKey.insert(random.nextInt(100));
        }


        printArray(sortedArrayPriorityKey.array);


    }

    @Test
    public void testName() throws Exception {
       int i = (int) 3.6;
        System.out.print("asd");

    }
}