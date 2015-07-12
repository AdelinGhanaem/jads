package com.problems;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class ThreadLocalExample {


    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(0);

    private static ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
        @Override
        public Integer initialValue() {
            return ATOMIC_INTEGER.getAndIncrement();
        }
    };

    public static void main(String[] args) {


    }


}
