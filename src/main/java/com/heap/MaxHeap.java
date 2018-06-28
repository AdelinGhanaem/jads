package com.heap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxHeap {


    private int[] ints;

    private int size = 0;


    public MaxHeap(int capacity) {
        ints = new int[capacity];
    }


    public void add(int element) {
        ints[size] = element;
        int i = size;
        while (i >= 0) {
            if (ints[i] > ints[(i - 1) / 2]) {
                swap(ints, i, (i - 1) / 2);
            } else {
                break;
            }
            i = (i - 1) / 2;
        }
        size++;
    }


    public int poll(int[] ints, int size) {
        int i = ints[0];
        ints[0] = ints[--size];

        int k = 0;
        while (k * 2 + 2 <= size) {
            if (ints[k * 2 + 1] > ints[k * 2 + 2]) {
                if (ints[k * 2 + 1] > ints[k])
                    swap(ints, k, k * 2 + 1);
            } else {
                if (ints[k * 2 + 2] > ints[k])
                    swap(ints, k, k * 2 + 2);
            }
            k = k * 2 + 2;
        }
        return i;
    }

    public int peak() {
        return ints[0];
    }

    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(Main.class.getResourceAsStream("/input05.txt"));
        int n = in.nextInt();
        System.out.println("------------- " + n + "------------- ");
        MaxHeap maxHeap = new MaxHeap(n);
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            maxHeap.add(b);
        }


        int[] k = new int[n];
        for (int i = 0; i < k.length; i++) {
            k[i] = maxHeap.poll(maxHeap.ints, maxHeap.size);
        }
        int[] c = Arrays.copyOf(k, k.length);
        Arrays.sort(c);
        int[] p = reverse(k);
        System.out.println(Arrays.equals(c, p));

    }


    static int[] reverse(int[] ints) {

        int[] ints1 = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            ints1[ints1.length - 1 - i] = ints[i];
        }
        return ints1;
    }
}
