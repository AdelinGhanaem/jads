package com.heap;

import java.util.Scanner;

public class MinHeap {


    private int[] ints;

    private int size = 0;


    public boolean assertIntOrder() {

        if (size > 1) {
            int[] copy = new int[ints.length];
            for (int i = 0; i < copy.length; i++) {
                copy[i] = ints[i];
            }
            int current = poll(copy, size);
            int next;

            for (int i = 1; i < copy.length; i++) {
                next = poll(copy, size);
                if (current > next) {
                    System.out.println("----------------------------------- INDEX:" + i);

                    return false;
                }
                current = next;
            }

        }
        return true;

    }

    public MinHeap(int capacity) {
        ints = new int[capacity];
    }


    public void add(int element) {
        ints[size] = element;
        int i = size;
        while (i >= 0) {
            if (ints[i] < ints[(i - 1) / 2]) {
                swap(ints, i, (i - 1) / 2);
            } else {
                break;
            }
            i = (i - 1) / 2;
        }
        size++;
    }


    public int poll(int[] array, int size) {
        int i = array[0];
        array[0] = array[--size];

        int k = 0;

        while (k * 2 + 2 <= size) {
            if (array[k * 2 + 1] < array[k * 2 + 2]) {
                if (array[k * 2 + 1] < array[k])
                    swap(array, k, k * 2 + 1);
            } else {
                if (array[k * 2 + 2] < array[k])
                    swap(array, k, k * 2 + 2);
            }
            k = k * 2 + 2;
        }
        return i;
    }


    public int peak() {
        return ints[0];
    }

    private void swap(int[] array, int a, int b) {
        array[a] = array[a] + array[b];
        array[b] = array[a] - array[b];
        array[a] = array[a] - array[b];
    }

    public int size() {
        return size;
    }


    public static void main(String[] args) {

           System.out.println(2.5d > 2);
        Scanner in = new Scanner(Main.class.getResourceAsStream("/input05.txt"));
        int n = in.nextInt();
        System.out.println("------------- " + n + "------------- ");
        MinHeap minHeap = new MinHeap(n);
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            minHeap.add(b);
            minHeap.assertIntOrder();
            System.out.println("------------- " + minHeap.size() + "------------- ");

        }
    }

}
