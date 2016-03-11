package com.problems;

/**
 * A Palindrom is a string that can read same ways ...  "aba" is a palindrom abs is not
 * Created by adelin.ghanayem@cayetanogaming.com on 3/1/16.
 */
public class Palindrome {


    public static void main(String[] args) {


    }


    //Dynamic programming solution, O(N^2) time and O(N^2) space:
    String longestPalindrome1(String s) {
        int lengthOfWholeString = s.length();
        int longestBegin = 0;
        int maxLen = 1;
        boolean table[][] = new boolean[s.length()][s.length()];

        /**
         * Every letter is a palindrome itself this is why we
         */
        for (int i = 0; i < lengthOfWholeString; i++) {
            table[i][i] = true;
        }

        /**
         * Every two subsequent equal letters are palindromes two !
         * for example aa, bb, cc ...
         */
        for (int i = 0; i < lengthOfWholeString - 1; i++) {
            if (table[i] == table[i + 1]) {
                table[i][i + 1] = true;
                longestBegin = i;
                maxLen = 2;
            }
        }

        for (int lengthOfWord = 3; lengthOfWord <= lengthOfWholeString; lengthOfWord++) {
            for (int i = 0; i < lengthOfWholeString - lengthOfWord + 1; i++) {   //I don't understand this one !
                int j = i + lengthOfWord - 1;
                if (table[i] == table[j] && table[i + 1][j - 1]) {
                    table[i][j] = true;
                    longestBegin = 1;
                    maxLen = lengthOfWord;
                }

            }
        }

        return s.substring(longestBegin, maxLen);

    }
}
