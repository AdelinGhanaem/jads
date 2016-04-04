package com.mutithreading.taskcancelation;

import java.util.concurrent.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/13/16.
 */
public class TimedRun {

    PrimeGenerator primeGenerator = new PrimeGenerator();
    private ExecutorService executor = Executors.newFixedThreadPool(10);

    public void run() {


    }


    public void timedRun(Runnable runnable, long timeout, TimeUnit timeUnit) {

        Future future= executor.submit(runnable);

        try{
            future.get(timeout,timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally{
            future.cancel(true);
        }

    }

    public static void main(String[] args) {

    }
}
