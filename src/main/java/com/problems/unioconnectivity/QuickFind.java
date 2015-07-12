package com.problems.unioconnectivity;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class QuickFind implements UnionFind{


    private int[] array = null;

    public QuickFind(int size) {
        array = initiateArray(size);
    }


    public boolean connected(int p, int q) {
        return array[p] == array[q];
    }




    public void connect(int p, int q) {


        int pId = array[p];
        int qId = array[q];

        //O(n) to connect two elements
        //O(n^2) to connect n elements ...
        for (int i = 0; i < array.length; i++) {
            if (array[i] == pId) {
                array[i] = qId;
            }
        }
    }

    private int[] initiateArray(int size) {


        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;

    }


    public void printArray() {

        for (int i = 0; i < array.length; i++) {


            System.out.println("array[" + i + "]=" + array[i]);

        }


    }
}
