package com.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.fail;

public class Utils {


    public static <T> void printArray(T[] ts) {

        for (T t : ts) {
            System.out.print(" " + t);
        }
    }


    public static Integer[] getIntegersFromFile(String pathname) throws IOException {


        File file = new File(pathname);

        if (!file.exists()) {
            fail("find the file!");
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line = bufferedReader.readLine();

        List<Integer> integers = new LinkedList<>();

        while (line != null) {
            integers.add(Integer.parseInt(line));
            line = bufferedReader.readLine();
        }

        Integer[] integers1 = new Integer[integers.size()];
        return integers.toArray(integers1);
    }
}
