package com.problems.unioconnectivity;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public interface UnionFind {


    /**
     * Connects two elements p,q
     * @param p
     * @param q
     */
    public void connect(int p, int q);


    /**
     * returns if two elements are connected or not
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q);


    public void printArray();
}
