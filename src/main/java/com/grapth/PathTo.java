package com.grapth;

import java.util.Stack;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/7/16.
 */
public class PathTo {


    private boolean[] marked;
    private Vertex<Integer>[] edgeTo;
    private Vertex<Integer> integerVertex;

    public PathTo(GenericGraph genericGraph, Vertex<Integer> vertex) {
        this.integerVertex = vertex;
        edgeTo = new Vertex[genericGraph.sizeOfVertices()];
        marked = new boolean[genericGraph.sizeOfVertices()];
        dfs(genericGraph,vertex);
    }


    // depth first search from v
    private void dfs(GenericGraph G, Vertex<Integer> v) {
        marked[v.getValue()] = true;
        for (Object current : G.getAdjacentTo(v)) {
            if (!marked[((Vertex<Integer>) current).getValue()]) {
                edgeTo[((Vertex<Integer>) current).getValue()] = v;
                dfs(G, (Vertex<Integer>) current);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }


    public Iterable<Integer> pathTo(int v) {

        if (!marked[v]) {
            return null;
        } else {

            Stack<Integer> stack = new Stack<Integer>();

            for (int x = v; x != integerVertex.getValue(); x = edgeTo[x].getValue()) {
                stack.add(x);
            }
            stack.add(integerVertex.getValue());
            return stack;
        }


    }


}
