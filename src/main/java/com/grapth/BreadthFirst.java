package com.grapth;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 *
 * Created by adelin.ghanayem@cayetanogaming.com on 3/7/16.
 */
public class BreadthFirst {


    private boolean[] visited;
    private Integer edgeTo[];
    private Integer destinationTo[];


    public void init(GenericGraph<Integer> genericGraph, Vertex<Integer> firstNode) {
        visited = new boolean[genericGraph.sizeOfVertices()];
        destinationTo = new Integer[genericGraph.sizeOfVertices()];
        edgeTo = new Integer[genericGraph.sizeOfVertices()];

        breadthFirst(genericGraph, firstNode);
    }

    private void breadthFirst(GenericGraph<Integer> genericGraph, Vertex<Integer> vertex) {
        Queue<Vertex<Integer>> vertexesQueue = new LinkedList<>();

        for (int i = 0; i < genericGraph.sizeOfVertices(); i++) {
            destinationTo[i] = Integer.MAX_VALUE;
        }

        destinationTo[vertex.getValue()] = 0;
        vertexesQueue.add(vertex);

        while (!vertexesQueue.isEmpty()) {

            Vertex<Integer> current = vertexesQueue.remove();
            System.out.println(current.getValue());
            for (Vertex<Integer> each : current.getAdjacents()) {
                if (!visited[each.getValue()]) {
                    visited[each.getValue()] = true;

                    edgeTo[each.getValue()] = current.getValue();
                    destinationTo[each.getValue()] = destinationTo[current.getValue()] + 1;
                    vertexesQueue.add(each);
                }
            }

        }


    }


    public Iterable<Integer> pathTo(int v) {
        if (!visited[v]) return null;
        Stack<Integer> path = new Stack<Integer>();
        int x;
        for (x = v; destinationTo[x] != v; x = edgeTo[x])
            path.push(x);
        path.push(x);
        return path;
    }


}
