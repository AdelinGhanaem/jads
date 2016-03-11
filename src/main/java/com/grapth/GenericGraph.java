package com.grapth;

import java.util.List;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/2/16.
 */
public interface GenericGraph<I> {


    int sizeOfVertices();

    int sizeOfEdges();

    void addEdge(Vertex<I> firstVertex, Vertex<I> secondVertex);

    List<Vertex<I>> getAdjacentTo(Vertex<I> vVertex);

    Vertex<I> getVertex(I value);


}
