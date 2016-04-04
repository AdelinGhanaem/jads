package com.mutithreading;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class TestHarness {


    public static void main(String[] strings) throws InterruptedException {


        System.out.println("Time :" + timeTasks(10, new Runnable() {
            @Override
            public void run() {
                for (int i = 0; true; i++) {
                    try {
                        new ArrayList();
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println();
                }
            }
        }));
    }


    public static long timeTasks(int nThreads, final Runnable task) throws InterruptedException {

        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);


        //this is the start position
        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {
                public void run() {
                    try {
                        startGate.await();
                        try {
                            task.run();
                        } finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException ignored) {

                    }
                }
            };
            t.start();
        }

        long start = System.nanoTime();
        //eveything is in place ... Shoooooooooooot the gun !
        startGate.countDown();

        endGate.await();// main thread !!!

        long end = System.nanoTime();
        return end - start;
    }
}