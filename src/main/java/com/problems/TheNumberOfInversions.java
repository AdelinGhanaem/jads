package com.problems;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.fail;

public class TheNumberOfInversions {

    public static void main(String[] args) throws IOException {


//		int[] array = new int[]{6,5,4,3,2,1};
//
//		System.out.println(new BruteForceInversionsCounter().count(array));
//		System.out.println(new DivideAndConcur().count(array));


        TheNumberOfInversions theNumberOfInversions = new TheNumberOfInversions();
        theNumberOfInversions.fromFile();


    }

    public void fromFile() throws IOException {


        File file = new File("/home/adelin/workspace/jads/src/main/resources/IntegerArray.txt");

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



        DivideAndConquerInversionsCounter counter = new DivideAndConquerInversionsCounter();

//        System.out.println(counter.count(integers1));


    }




}
