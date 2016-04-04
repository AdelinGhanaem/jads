package com;


/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/11/15.
 */
public class Main {


    public static void main(String arg[]) {


    }


    static class Apple {

    }

    static class A {
        private String a;
    }


    static class B extends A {

        private int a;
    }


    private static void asd(int x, String s) {
        long startTime1 = System.nanoTime();
        System.out.println(s + x);
        long endTime1 = System.nanoTime();

    }


    // convert a String of 0's and 1's into an integer
    public static int fromBinaryString(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') result = 2 * result;
            else if (c == '1') result = 2 * result + 1;
        }
        return result;
    }


    public static int fromBinary(String s) {
        int result = 0;
        int powerOfTwo = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ('1' == s.charAt(i)) {
                result += Math.pow(2, powerOfTwo);
            }
            powerOfTwo++;
        }

        return result;
    }
}
