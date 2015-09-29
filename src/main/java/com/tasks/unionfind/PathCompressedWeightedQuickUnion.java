package com.tasks.unionfind;

/**
 * While looking for the root of some given node we actually touching all the nodes on the way up and the question is
 * why don't we make each one of these node point the root ? isn't it better ?
 * Created by adelin.ghanayem@cayetanogaming.com on 9/12/15.
 */
public class PathCompressedWeightedQuickUnion extends WeightedQuickUnion {


    public PathCompressedWeightedQuickUnion(int size) {
        super(size);
    }

    protected int getRoot(int i) {
        while (i != id[i]) {
            int val = id[i];
            id[i] = id[id[i]];  // this is what will make the algorithm runs very very very FAST !
            i = id[i];

        }
        return i;
    }

}
