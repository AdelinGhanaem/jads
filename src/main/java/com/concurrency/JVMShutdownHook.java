package com.concurrency;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/20/16.
 */
public class JVMShutdownHook {


    public static void main(String[] args) {

        new Thread();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are shutting down ... !!! ");
            }
        }));
        Runtime.getRuntime();


        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
