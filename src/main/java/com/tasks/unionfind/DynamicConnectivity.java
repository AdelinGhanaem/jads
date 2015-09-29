package com.tasks.unionfind;

/**
 *
 * Created by adelin.ghanayem@cayetanogaming.com on 9/10/15.
 */
public interface DynamicConnectivity {


    /**
     * Connects two elements together
     *
     * @param p the first element
     * @param q the second element
     */
    void union(int p, int q);

    /**
     * Check if two elements are connected or not
     * @param p first elements
     * @param q second element
     * @return
     */

    boolean connected(int p, int q);


    /**
     *
     * @return
     */
    int[] getArray();
}
