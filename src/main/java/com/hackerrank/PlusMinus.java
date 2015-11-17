package com.hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/6/15.
 */
public class PlusMinus {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        scanner.nextLine();

        int[] integers = new int[size];

        int index = 0;

        String[] stringNumbers = scanner.nextLine().split(" ");

        while (index < size) {
            integers[index] = Integer.valueOf(stringNumbers[index]);
            index++;
        }

        double positives = 0;
        double negatives = 0;
        double zeroz = 0;

        for (int number : integers) {

            if (number > 0) {
                positives++;
            }

            if (number < 0) {
                negatives++;
            }


            if (number == 0) {
                zeroz++;
            }

        }




        System.out.println(new BigDecimal(positives / size).setScale(3, BigDecimal.ROUND_HALF_UP).toString());

        System.out.println(new BigDecimal(negatives / size).setScale(3, BigDecimal.ROUND_HALF_UP).toString());

        System.out.println(new BigDecimal(zeroz / size).setScale(3, BigDecimal.ROUND_HALF_UP).toString());


    }
}
