package com.mutithreading.oracle;

import javax.annotation.processing.SupportedSourceVersion;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/5/16.
 */
public class JoinExample {


    public static void main(String[] args) {


        ThreadChain threadChain1 = new ThreadChain(null);
        ThreadChain threadChain2 = new ThreadChain(threadChain1);
        ThreadChain threadChain3 = new ThreadChain(threadChain2);

        threadChain3.start();
        threadChain2.start();
        threadChain1.start();

    }


    static class ThreadChain extends Thread {

        Thread thread;

        public ThreadChain(Thread thread) {
            this.thread = thread;
        }


        @Override
        public void run() {
            if (thread != null) {
                try {
                    System.out.println("I have started but waiting for " + thread.getName() + " to finish ");
                    thread.join();
                    System.out.println("Thread " + thread.getName() + " has finished ... moving on ! ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " is counting: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
