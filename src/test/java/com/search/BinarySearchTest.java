package com.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/22/16.
 */
public class BinarySearchTest {


    @Test
    public void testName() throws Exception {


        System.out.println(new BinarySearch().search(new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");

        }}, "g"));

    }
}