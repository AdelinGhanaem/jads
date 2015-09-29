package com.sorting;

import org.junit.Test;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/1/15.
 */
public class TestClass {
    char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'X','Z'};

    @Test
    public void alphaToNumbers() throws Exception {

        for (int i : toIntArray(new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'X','Z'})) {
            System.out.print(i + ",");
        }
    }

    private int[] toIntArray(char[] chars) {

        int[] ints = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = ((int) chars[i]) - 96;
        }

        for (int i = 0; i < ints.length; i++) {

            System.out.println(chars[i] + " - " + (i + 1));
        }
        return ints;


    }
}
