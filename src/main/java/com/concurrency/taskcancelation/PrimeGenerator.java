package com.concurrency.taskcancelation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Thread interruption is a cooperative mechanism for a thread to signal
 * another thread that it should, at its convenience and if it feels like it, stop what it
 * is doing and do something else.
 * Created by adelin.ghanayem@cayetanogaming.com on 1/5/16.
 */
public class PrimeGenerator implements Runnable {

    private volatile boolean cancellationRequested = false;
    private final BlockingQueue<BigInteger> queue = new ArrayBlockingQueue<BigInteger>(10);

    public void run() {

        BigInteger bigInteger = BigInteger.ONE;
        while (!cancellationRequested) {//here we check for cancellation flag.
            //this is graceful cancellation
            //and it is done without thread interruptions.
            try {
                //here this is a blocking method and if it block then thread cant continue and can't make another iteration
                //to check if cancellationRequested and this can make the thread loop forever if the put method keeps blocking it !
                queue.put(bigInteger = bigInteger.nextProbablePrime());//this is problematic primes generator ... !!!
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(bigInteger);
        }
    }


    public void cancel() {
        cancellationRequested = true;
    }


    public static void main(String[] args) {



    }


    List<BigInteger> aSecondOfPrimes() {
        PrimeGenerator generator = new PrimeGenerator();
        Thread thread = new Thread(generator);
//        thread.setPriority();
        thread.start();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            generator.cancel();
        }
        return generator.get();
    }

    private List<BigInteger> get() {
        return new ArrayList<BigInteger>();
    }
}
