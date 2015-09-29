package com.tasks.unionfind;

import org.junit.Test;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/12/15.
 */
public class SimpleUnionFindTest {


    @Test
    public void taks1() {
        DynamicConnectivity dynamicConnectivity = new UnionQuickFind(10);

        /**
         * Give the id[] array that results from the following sequence of 6 union
         * operations on a set of 10 items using the quick-find algorithm.
         1-2 2-7 1-5 1-3 0-1 3-9
         */


        dynamicConnectivity.union(1, 2);
        dynamicConnectivity.union(2, 7);
        dynamicConnectivity.union(1, 5);
        dynamicConnectivity.union(1, 3);
        dynamicConnectivity.union(0, 1);
        dynamicConnectivity.union(3, 9);

        assert dynamicConnectivity.connected(1, 2);
        assert dynamicConnectivity.connected(2, 7);
        assert dynamicConnectivity.connected(1, 5);
        assert dynamicConnectivity.connected(1, 3);
        assert dynamicConnectivity.connected(0, 1);
        assert dynamicConnectivity.connected(3, 9);

        for (int i : dynamicConnectivity.getArray()) {
            System.out.print(i + " ");
        }


    }

    @Test
    public void testingQuickUnion() {
        DynamicConnectivity dynamicConnectivity = new QuickUnion(10);

        /**
         * Give the id[] array that results from the following sequence of 6 union
         * operations on a set of 10 items using the quick-find algorithm.
         1-2 2-7 1-5 1-3 0-1 3-9
         */


        dynamicConnectivity.union(1, 2);
        dynamicConnectivity.union(2, 7);
        dynamicConnectivity.union(1, 5);
        dynamicConnectivity.union(1, 3);
        dynamicConnectivity.union(0, 1);
        dynamicConnectivity.union(3, 9);

        for (int i : dynamicConnectivity.getArray()) {
            System.out.print(i + " ");
        }

        assert dynamicConnectivity.connected(1, 2);
        assert dynamicConnectivity.connected(2, 7);
        assert dynamicConnectivity.connected(1, 5);
        assert dynamicConnectivity.connected(1, 3);
        assert dynamicConnectivity.connected(0, 1);
        assert dynamicConnectivity.connected(3, 9);

//        for (int i : dynamicConnectivity.getArray()) {
//            System.out.print(i + " ");
//        }
//

    }

    @Test
    public void weightedQuickUnion() {
        DynamicConnectivity dynamicConnectivity = new WeightedQuickUnion(10);

        /**
         * Give the id[] array that results from the following sequence of 6 union
         * operations on a set of 10 items using the quick-find algorithm.
         1-2 2-7 1-5 1-3 0-1 3-9
         */


        dynamicConnectivity.union(5, 8);
        dynamicConnectivity.union(6, 9);
        dynamicConnectivity.union(0, 1);
        dynamicConnectivity.union(2, 3);
        dynamicConnectivity.union(8, 1);
        dynamicConnectivity.union(3, 4);

        dynamicConnectivity.union(9, 2);
        dynamicConnectivity.union(5, 9);
        dynamicConnectivity.union(0, 7);


        for (int i : dynamicConnectivity.getArray()) {
            System.out.print(i + " ");
        }

//        assert dynamicConnectivity.connected(1, 2);
//        assert dynamicConnectivity.connected(2, 7);
//        assert dynamicConnectivity.connected(1, 5);
//        assert dynamicConnectivity.connected(1, 3);
//        assert dynamicConnectivity.connected(0, 1);
//        assert dynamicConnectivity.connected(3, 9);
//
//        for (int i : dynamicConnectivity.getArray()) {
//            System.out.print(i + " ");
//        }


    }


    @Test
    public void pathCompressedWeightedQuickUnion() {
        DynamicConnectivity dynamicConnectivity = new PathCompressedWeightedQuickUnion(10);

        /**
         * Give the id[] array that results from the following sequence of 6 union
         * operations on a set of 10 items using the quick-find algorithm.
         1-2 2-7 1-5 1-3 0-1 3-9
         */


        dynamicConnectivity.union(1, 2);
        dynamicConnectivity.union(2, 7);
        dynamicConnectivity.union(1, 5);
        dynamicConnectivity.union(1, 3);
        dynamicConnectivity.union(0, 1);
        dynamicConnectivity.union(3, 9);


        for (int i : dynamicConnectivity.getArray()) {
            System.out.print(i + " ");
        }

        assert dynamicConnectivity.connected(1, 2);
        assert dynamicConnectivity.connected(2, 7);
        assert dynamicConnectivity.connected(1, 5);
        assert dynamicConnectivity.connected(1, 3);
        assert dynamicConnectivity.connected(0, 1);
        assert dynamicConnectivity.connected(3, 9);

        for (int i : dynamicConnectivity.getArray()) {
            System.out.print(i + " ");
        }


    }


    @Test
    public void withStopWatch() {


        check(2);
        check(4);
        check(8);
        check(16);
        check(32);
        check(64);
        check(128);
        check(256);
        check(512);

    }

    private void check(double n) {
        System.out.print(n + " - ");

        int sum = 0;
        for (int i = 1; i * i <= n; i = i * 4)
            for (int j = 0; j < i; j++)
                sum++;

        System.out.print(sum);
        System.out.println("");

    }

}