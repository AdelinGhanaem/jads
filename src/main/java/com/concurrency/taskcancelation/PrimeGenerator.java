package com.concurrency.taskcancelation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/5/16.
 */
public class PrimeGenerator implements Runnable {

    private volatile boolean cancellationRequested = false;

    public void run() {

        BigInteger bigInteger = BigInteger.ONE;
        while (!cancellationRequested) {//here we check for cancellation flag.
            //this is graceful cancellation
            //and it is done without thread interruptions.
            bigInteger = bigInteger.nextProbablePrime();
            System.out.println(bigInteger);
        }
    }


    public void cancel() {
        cancellationRequested = true;
    }


    public static void main(String[] args) {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        primeGenerator.aSecondOfPrimes();
    }


    List<BigInteger> aSecondOfPrimes() {
        PrimeGenerator generator = new PrimeGenerator();
        new Thread(generator).start();

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
