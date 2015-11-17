package com.hackerrank;

import java.util.Scanner;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/16/15.
 */
public class JavaLoops {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        input.nextLine();
        int[][] ints = new int[testCases][];

        for (int i = 0; i < testCases; i++) {

            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            int[] sequence = new int[n];


            for (int j = 1; j <= n; j++) {

                int current = a;

                for (int p = 0; p < j; p++) {
                    current += Math.pow(2, p) * b;
                }

                sequence[j - 1] = current;
            }
            if (i < testCases - 1) {
                input.nextLine();
            }
            ints[i] = sequence;
        }


        for (int[] ints1 : ints) {
            for (int t : ints1) {
                System.out.print(t + " ");
            }
            System.out.println();
        }

    }
}
