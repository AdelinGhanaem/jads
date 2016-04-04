package com.grapth.course;

/**
 * This interface represents path of a vertex in a graph
 * Created by adelin.ghanayem@cayetanogaming.com on 3/21/16.
 */
public interface Path {

    boolean hasPathTo(int vertex);

    Iterable<Integer> pathTo(int v);
}
