package com.grapth;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/7/16.
 */
public class DepthFirstSearch {


    private boolean[] marked;
    private int count;


    public DepthFirstSearch(GenericGraph genericGraph, Vertex<Integer> v) {
        marked = new boolean[genericGraph.sizeOfVertices()];

        depthFirstSearch(genericGraph, v, new OnVisit() {
            @Override
            public void execute(Vertex<Integer> v) {
//                System.out.print(v.getValue());
            }
        }, 1);
    }

    private void depthFirstSearch(GenericGraph genericGraph, Vertex<Integer> v, OnVisit onVisit, Integer recursion) {
        count++;
        marked[v.getValue()] = true;


//        for (int i = 0; i < recursion; i++) {
//            System.out.print(" > ");
//        }

        onVisit.execute(v);

        for (Object current : genericGraph.getAdjacentTo(v)) {
            if (!marked[((Vertex<Integer>) current).getValue()]) {

                depthFirstSearch(genericGraph, (Vertex<Integer>) current, onVisit, recursion++);
            }
        }
        recursion--;
    }

    public boolean marked(Vertex<Integer> integerVertex) {
        return marked[integerVertex.getValue()];
    }
}
