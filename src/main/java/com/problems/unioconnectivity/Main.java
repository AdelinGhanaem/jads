package com.problems.unioconnectivity;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Main {


    public static void main(String[] args) {


        //With basic find !
//        BasicUnionFind basicUnionFind = new BasicUnionFind(10);
//
//        System.out.println(basicUnionFind.connected(1, 2));
//        System.out.println(basicUnionFind.connected(3, 5));
//        System.out.println(basicUnionFind.connected(7, 2));
//        System.out.println(basicUnionFind.connected(7, 3));
//
//
//        basicUnionFind.connect(1, 2);
//        basicUnionFind.connect(3, 5);
//        basicUnionFind.connect(7, 2);
//        basicUnionFind.connect(3, 7);
//
//
//        System.out.println(basicUnionFind.connected(1, 2));
//        System.out.println(basicUnionFind.connected(3, 5));
//        System.out.println(basicUnionFind.connected(7, 2));
//        System.out.println(basicUnionFind.connected(7, 3));
//
//
//        basicUnionFind.printArray();

        // With wighted union find !
        QuickUnion unionFind = new QuickUnion(10);

        System.out.println(unionFind.connected(1, 2));
        System.out.println(unionFind.connected(3, 5));
        System.out.println(unionFind.connected(7, 2));
        System.out.println(unionFind.connected(7, 3));


        unionFind.connect(1, 2);
        unionFind.connect(3, 5);
        unionFind.connect(7, 2);
        unionFind.connect(3, 7);


        System.out.println(unionFind.connected(1, 2));
        System.out.println(unionFind.connected(3, 5));
        System.out.println(unionFind.connected(7, 2));
        System.out.println(unionFind.connected(7, 3));


        unionFind.printArray();





    }


}
