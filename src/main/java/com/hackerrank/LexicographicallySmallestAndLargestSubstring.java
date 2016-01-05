package com.hackerrank;

import java.util.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/23/15.
 */
public class LexicographicallySmallestAndLargestSubstring {


    public static void main(String[] strings) {

        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();
        int k = scanner.nextInt();

        if(s.length()<=1000){
            Set<String> set = new TreeSet<>();

            for (int i = 0; i <= s.length() - k; i++) {
                set.add(s.substring(i, i + k));
            }

            List<String> strings1 = new ArrayList<>(set);

            System.out.println(strings1.get(0));
            System.out.println(strings1.get(strings1.size() - 1));

        }


    }
}
