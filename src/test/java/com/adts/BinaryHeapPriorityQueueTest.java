package com.adts;

import org.junit.Test;

import java.util.Random;


/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/29/15.
 */
public class BinaryHeapPriorityQueueTest {


    @Test
    public void testName() throws Exception {

        BinaryHeapPriorityQueue binaryHeapPriorityQueue = new BinaryHeapPriorityQueue();

        Random random = new Random();


        int[] ints = new int[]{8, 10, 1, 2, 3, 7, 9, 8};

        for (int i = 0; i < 8; i++) {
            binaryHeapPriorityQueue.insert(ints[i]);
        }

        for (int i : binaryHeapPriorityQueue.array) {
            System.out.println(i);
        }
    }
}