package com.grapth.course;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/21/16.
 */
public class SimplePath implements Path {


    private final Graph graph;
    private final int vertex;



    public SimplePath(Graph graph, int vertex) {
        this.graph = graph;
        this.vertex = vertex;

    }

    @Override
    public boolean hasPathTo(int vertex) {
        return false;
    }

    @Override
    public Iterable<Integer> pathTo(int v) {
        return null;
    }
}
