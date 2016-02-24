package com.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/23/16.
 */
public class BinarySearchTreeTest {


    @Test
    public void testName() throws Exception {


        BinarySearchTree<String,String> binarySearchTree = new BinarySearchTree<>();
       String s;

        binarySearchTree.put("Adelin1","1");
        binarySearchTree.put("Adelin2","2");
        binarySearchTree.put("Adelin3","3");
        binarySearchTree.put("Adelin4","4");
        binarySearchTree.put("Adelin5","5");


        System.out.println(binarySearchTree.get("Adelin5"));


    }
}