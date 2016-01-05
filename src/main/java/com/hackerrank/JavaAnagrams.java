package com.hackerrank;

import java.util.Arrays;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 12/16/15.
 */
public class JavaAnagrams {


    public static void main(String[] strings) {
        String a = "CAT";
        String b = "TAC";

        if (isAnagramOf(a, b)) {
            //TODO:do something !
        }

    }


    private static boolean isAnagramOf(String a, String b) {
        char[] charsA = a.toLowerCase().toCharArray();
        Arrays.sort(charsA);
        char[] charsB = b.toLowerCase().toCharArray();
        Arrays.sort(charsB);
        return Arrays.equals(charsA, charsB);
    }
}
