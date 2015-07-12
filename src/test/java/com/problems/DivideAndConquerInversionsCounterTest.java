package com.problems;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class DivideAndConquerInversionsCounterTest {


    @Test
    public void countsInversions() throws Exception {


        Integer[] integers = new Integer[]{3, 2, 1};

        DivideAndConquerInversionsCounter counter = new DivideAndConquerInversionsCounter();

        assertThat(counter.count(integers), is(3));

    }

//    @Test

    public void fromFile() throws IOException {

        File file = new File("IntegerArray.txt");

        if (!file.exists()) {
            fail("find the file!");
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line = bufferedReader.readLine();

        List<Integer> integers = new LinkedList<>();

        while (line != null) {
            integers.add(Integer.parseInt(line));
        }

        DivideAndConquerInversionsCounter counter = new DivideAndConquerInversionsCounter();

        Integer[] integers1 = new Integer[integers.size()];

        integers1 = integers.toArray(integers1);

        System.out.println(counter.count(integers1));


    }
}