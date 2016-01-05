package com.hackerrank;

import java.util.Scanner;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 12/16/15.
 */
public class JavaStringToken {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.length() <= 400000) {
            if (s.length() == 0) {
                System.out.print(0);
            } else {

                String words[] = s.trim().split("[ !,?.\\_'@]+");
                System.out.println(words.length);
                for (String m : words) {
                    System.out.println(m);
                }
            }

        }
    }
}
