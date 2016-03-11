package com.sorting;

import java.util.Random;

public class Utils {


    public static <T> void printArray(T[] ts) {

        for (T t : ts) {
            System.out.print(" " + t);
        }
    }


    public static <T> void swap(T[] ts, int i, int j) {
        T tmp = ts[i];
        ts[i] = ts[j];
        ts[j] = tmp;
    }


    public static Integer[] getRandomArray(int size) {

        Random random = new Random(0);

        Integer[] integers = new Integer[size];

        for (int i = 0; i < size; i++) {
            integers[i] = random.nextInt(100) + 100;
        }

        return integers;

    }

    public static void out(Object s){
        System.out.print(s);
    }
}
