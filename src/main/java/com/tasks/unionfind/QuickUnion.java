package com.tasks.unionfind;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/12/15.
 */
public class QuickUnion implements DynamicConnectivity {

    private int id[];
    private int size;


    public QuickUnion(int size) {
        id = new int[size];

        this.size = size;

        for (int i = 0; i < id.length; i++) {
            this.id[i] = i;
        }

    }

    @Override
    public void union(int p, int q) {
        int pId = getRoot(p);
        int qId = getRoot(q);
        id[qId] = pId;
    }

    @Override
    public boolean connected(int p, int q) {
        return getRoot(id[p]) == getRoot(id[q]);
    }

    private int getRoot(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }


    @Override
    public int[] getArray() {
        return id;
    }
}
