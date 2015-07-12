package com.problems.unioconnectivity;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class QuickUnion implements UnionFind {


    private int[] size;
    private Integer[] id;


    public QuickUnion(int treeSize) {

        this.size = new int[treeSize];

        id = new Integer[treeSize];


        for (int i = 0; i < treeSize; i++) {
            size[i] = 1;
        }

        for (int i = 0; i < treeSize; i++) {
            id[i] = i;
        }


    }

    @Override
    public void connect(int p, int q) {

        int i = root(p);

        //path
        int j = root(q);

        if (i == j) {// they are connected !
            return;
        }
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];

        } else {
            id[j] = i;
            size[i] += size[j];
        }

    }


    private int root(int element) {

        List<Integer> linkedList = new LinkedList<>();

        while (id[element] != element) {

            element = id[element];
            id[element] =id[id[element]];

//            linkedList.add(element);
        }
        //I wanna cry !!!!
//        int root = id[element];
//
//        if (linkedList.size() > 0) {
//            for (Integer integer : linkedList) {
//                id[integer] = root;
//            }
//        }

        return id[element];
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void printArray() {


        Utils.printArray(this.id);
    }
}
