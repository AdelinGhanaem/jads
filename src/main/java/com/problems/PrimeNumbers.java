package com.problems;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/1/16.
 */
public class PrimeNumbers {


    public static void main(String[] strings) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.isPrime(25);

    }


    public int[] primes(int limit) {

        if (limit == 3)
            return new int[]{2, 3};

        List<Integer> integerList = new ArrayList<>();


        for (int i = 0; i < limit; i++) {
            if (isPrime(i)) {
                integerList.add(i);
            }
        }

        return null;

    }

    private boolean isPrime(int n) {

        if (n % 2 == 0)
            return false;
        int square = (int) Math.sqrt(n);
        for (int i = 3; i * i <= square; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
