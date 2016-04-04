package com.mutithreading.barriers;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/25/15.
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });


        t.start();
        System.out.println(t.isAlive());
        t.join();
        System.out.println(t.isAlive());
    }
}
