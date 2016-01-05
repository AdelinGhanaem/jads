package com.hackerrank;

import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
 * Created by adelin.ghanayem@cayetanogaming.com on 11/23/15.
 */
public class Palindrome {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        if (a.length() <= 50) {

            String reversed = new StringBuilder(a).reverse().toString();
            if (reversed.equals(a)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
