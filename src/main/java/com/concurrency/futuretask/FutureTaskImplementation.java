package com.concurrency.futuretask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/25/15.
 */
public class FutureTaskImplementation {


    public static void main(String[] args) {

        FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {

                Thread.sleep(3000);
                System.out.println("sleeping ... ");
                return "Yea";
            }
        });

        //We need a thread to start the task
        Thread thread = new Thread(futureTask);
        thread.start();


        try {
            System.out.println(futureTask.get());
            System.out.println("After 3 second this code is executed !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
