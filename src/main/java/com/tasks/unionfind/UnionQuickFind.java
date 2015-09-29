package com.tasks.unionfind;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/10/15.
 */
public class UnionQuickFind implements DynamicConnectivity {


    private int[] array;

    private int size;

    public UnionQuickFind(int size) {
        this.size = size;
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {

        /**
         * Takes N^2 times access to union N elements !
         * Each array access of union is take O(N) for N elements its O(N^2)
         */
        int pid = array[p];
        int qid = array[q];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == pid) {
                array[i] = qid;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return array[p] == array[q];
    }

    @Override
    public int[] getArray() {
        return array;
    }
}
