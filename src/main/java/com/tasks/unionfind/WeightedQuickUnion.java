package com.tasks.unionfind;

/**
 * QuickFind and QuickUnion tends to be very slow it takes O(N^2) for N elements to be found or connected
 * Here we have some steps to improve that and this is by :
 * 1- Mdofiy quick-unios to avoid tall tree,
 * 2- Keep track of the size of each tree ( takes additional array space vs speed )
 * 3- Balancing by linking smaller trees to taller trees
 * Created by adelin.ghanayem@cayetanogaming.com on 9/12/15.
 */
public class WeightedQuickUnion implements DynamicConnectivity {
    /**
     * IMPORTANT : How to proof the proposition that the depth of any x node is at most lg N ( base 2 ) ?
     */

    protected int[] id;
    protected int[] treeSize;


    private int size;


    public WeightedQuickUnion(int size) {
        this.size = size;
        id = new int[this.size];
        treeSize = new int[this.size];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            treeSize[i] = 1;
        }

    }

    @Override
    public void union(int p, int q) {

        int pTree = getRoot(p);
        int qTree = getRoot(q);
        /**
         * Union takes constant time given root,
         * BUT finding roots takes time which is LgN (base 2)  !
         */
        if (treeSize[pTree] > treeSize[qTree]) {
            id[qTree] = id[pTree];
            treeSize[pTree]++;
        } else {
            id[pTree] = id[qTree];
            treeSize[qTree]++;
        }
    }

    @Override
    public boolean connected(int p, int q) {

        /**
         * Here, when we guarantee that the smallest tree goes to the bigger tree
         * Find operation takes time proportional depth p and q
         *
         */
        return getRoot(p) == getRoot(q);
    }

    @Override
    public int[] getArray() {
        return id;
    }

    protected int getRoot(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }


}
