package com.mutithreading.prodcons;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/26/16.
 */
public class Buffer {


    public static void main(String[] args) {

        Buffer buffer = new Buffer(5);


        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {


                    for (int i = 0; i < 5; i++) {
                        buffer.put(i);
                    }
                }
            }
        }, "Producer");

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 5; i++) {
                        System.out.println(buffer.get());
                    }
                }
            }
        }, "Consumer");

        consumer.start();
        producer.start();

    }


    private int[] buffer;
    private int size = 0;
    private final Object lock = new Object();

    private Buffer(int size) {
        buffer = new int[size];
    }


    public int get() {


        System.out.println(Thread.currentThread().getName() + " continues, someone put something in the buffer ! ");

        synchronized (lock) {

            while (size <= 0) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " is waiting the buffer is empty ! ");
                }
            }


            int value = buffer[--size];
            lock.notifyAll();
            return value;
        }

    }

    public void put(int element) {


        synchronized (lock) {

            while (size == buffer.length) {

                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting the buffer is full ! ");
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted !  ! ");
                }
            }
            buffer[size++] = element;
            System.out.println(Thread.currentThread().getName() + " put value " + size + " in the buffer !");

            lock.notifyAll();

        }
    }


}
