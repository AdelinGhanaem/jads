package com.concurrency;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class OutOfTime {

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();

        //a single background thread that is used to execute all of the timer's tasks, >>>> sequentially <<<<
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                throw new IllegalArgumentException("Hmmmmmmmmm ! ");
            }
        }, 1000, 1000);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                System.out.println("Second: " + Thread.currentThread().getName());
            }
        }, 1000, 1000);

        Thread.sleep(5000);
        timer.cancel();


    }
}
