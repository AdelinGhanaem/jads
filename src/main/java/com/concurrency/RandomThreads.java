package com.concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class RandomThreads {


    private static final ExecutorService EXECUTOR_SERVICE = Executors.newScheduledThreadPool(100);

    public static void main(String[] strings) {
        RandomThreads randomThreads = new RandomThreads();
        randomThreads.run();

    }


    public void run() {

        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            EXECUTOR_SERVICE.submit(new Runnable() {
                @Override
                public void run() {

                    System.out.println("Thread name: " + Thread.currentThread().getName());
                    Random random = new Random();

                    int[] ints = new int[random.nextInt(100)];


                    for (int i = 0; i < ints.length; i++) {
                        ints[i] = random.nextInt(100);
                    }

                    for (int anInt : ints) {
                        System.out.println(anInt);
                    }
                }
            });

        }

    }
}
