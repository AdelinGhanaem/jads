package com.grapth.course;

import com.grapth.course.*;
import com.grapth.course.Vertex;

import java.util.List;
import java.util.Map;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/21/16.
 */
public class GenerigUndirectedGraph implements Graph<Integer> {



    private Map<Vertex<Integer>, List<Vertex<Integer>>> map;
    private int edgesNumber;
    private int verticiesNumber;

    public GenerigUndirectedGraph(Map<Vertex<Integer>, List<Vertex<Integer>>> map,
                                  int edgesNumber,
                                  int verticiesNumber) {
        this.map = map;
        this.edgesNumber = edgesNumber;
        this.verticiesNumber = verticiesNumber;
    }

    public GenerigUndirectedGraph() {
    }

    @Override
    public void addEdge(Integer v1, Integer v2) {
        System.out.println(v1 + " - " + v2);
    }

    @Override
    public Iterable<Integer> getAdjacents(Integer v) {
        return null;
    }

    @Override
    public int numberOfVertexes() {
        return 0;
    }

    @Override
    public int numberOfEdges() {
        return 0;
    }

    public void setEdgesNumber(int edgesNumber) {
        this.edgesNumber = edgesNumber;
    }

    public void setVerticiesNumber(int verticiesNumber) {
        this.verticiesNumber = verticiesNumber;
    }
}
