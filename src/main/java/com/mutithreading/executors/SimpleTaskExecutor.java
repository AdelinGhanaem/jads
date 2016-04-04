package com.mutithreading.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 12/17/15.
 */
public class SimpleTaskExecutor {



    private Executor executor= Executors.newFixedThreadPool(100);

    private void run(){
        while(true){
         //TODO:accept threads ...
        }
    }

    public static void main(String[] args) {
        SimpleTaskExecutor simpleTaskExecutor = new SimpleTaskExecutor();
        simpleTaskExecutor.run();
    }
}
