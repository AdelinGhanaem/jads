package com.problems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();


        String StringList = scanner.nextLine();

        String[] numbers = StringList.split(" ");


        List<Short> list = new ArrayList<>(size);

        for (String s : numbers) {
            list.add(Short.valueOf(s));
        }


        int queries = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < queries; i++) {
            String query = scanner.nextLine();

            if ("Insert".equals(query)) {
                String next = scanner.nextLine();
                String[] numbers1 = next.split(" ");
                list.add(Integer.valueOf(numbers1[0]), Short.valueOf(numbers1[1]));
            }

            if ("Delete".equals(query)) {
                String next = scanner.nextLine();
                int index = Integer.valueOf(next);
                list.remove(index);
            }
        }


        for (Short s : list) {
            System.out.print(s + " ");
        }


    }
}
