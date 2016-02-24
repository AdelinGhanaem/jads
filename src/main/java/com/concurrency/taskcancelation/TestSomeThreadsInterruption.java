package com.concurrency.taskcancelation;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/12/16.
 */
public class TestSomeThreadsInterruption {

    private int counter = 0;


    public static void main(String[] args) {
        TestSomeThreadsInterruption testSomeThreadsInterruption = new TestSomeThreadsInterruption();


        Thread thread1 = new Thread(() -> {
            while (true) {
                testSomeThreadsInterruption.increase();
            }
        });


        Thread thread2 = new Thread(() -> {

            try {
                Thread.sleep(10000);
                thread1.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });


        thread1.start();
        thread2.start();


//        Object o = new Object();
//
//        synchronized (o) {
//
//            Thread.currentThread().interrupt();
//
//            if (Thread.currentThread().isInterrupted()) {
//                throw new RuntimeException("RunTime !");
//            }
//            try {
//                o.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                System.out.println(Thread.currentThread().getName() + " is interrupted !");
//            }
//        }
//
    }

    private synchronized void increase() {

        System.out.println(counter++);

        if (counter % 5 == 0) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("OOOOOOOpppppppsss interrupted !");
                e.printStackTrace();
                return;

            }
        }

    }


}
