package com.mutithreading.sychronizers.latchers;

import java.util.concurrent.CountDownLatch;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/24/15.
 */
public abstract class BaseHealthChecker implements Runnable {


    private CountDownLatch latch;

    private String serviceName;
    private boolean serviceUp;

    @Override
    public void run() {

        try {

            doSomething();

        } catch (Exception e) {
           e.printStackTrace();

        } finally {
            latch.countDown();
        }


    }

     abstract void doSomething();

    public CountDownLatch getLatch() {
        return latch;
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isServiceUp() {
        return serviceUp;
    }
}
