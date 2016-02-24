package com.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/22/16.
 */
public class BinarySearchSTTest {


    @Test
    public void testName() throws Exception {
        BinarySearchST<String,String> stringStringBinarySearchST = new BinarySearchST<>();
        stringStringBinarySearchST.put("String1","val");
        stringStringBinarySearchST.put("String2","val");
        stringStringBinarySearchST.put("String6","val");
        stringStringBinarySearchST.put("String7","val");
        stringStringBinarySearchST.put("String8","val");

        stringStringBinarySearchST.put("String5","val");


    }
}