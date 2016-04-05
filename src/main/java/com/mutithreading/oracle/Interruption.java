package com.mutithreading.oracle;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/5/16.
 */
public class Interruption {

    public static void main(String[] args) {


        Thread thread = new Thread(() -> {

            while (true) {
                try {
                    //this method clear the interruption status i.e sets the status to true !
                    Thread.interrupted();
                    if (Thread.currentThread().isInterrupted()) {// now here this will return false even the thread was interrupted.
                        throw new RuntimeException();
                    }
                } catch (Throwable throwable) {

                }


            }

        });

        thread.start();
        thread.interrupt();
        System.out.print(thread.isInterrupted());
        System.out.print(thread.isAlive());
    }



}
