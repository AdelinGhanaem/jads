package com.grapth.course;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/21/16.
 */
public interface Graph<T> {


    void addEdge(T v1,T v2);

    Iterable<T> getAdjacents(T v);

    int numberOfVertexes();

    int numberOfEdges();


}
