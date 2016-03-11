package com.grapth;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/2/16.
 */
public class Vertex<V> {

    private V value;

    private List<Vertex<V>> adjacents = new LinkedList<>();


    public List<Vertex<V>> getAdjacents() {
        return adjacents;
    }

    public Vertex(V value, List<Vertex<V>> adjacents) {
        this.value = value;
        this.adjacents = adjacents;
    }

    public Vertex(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void adj(Vertex<V> vVertex) {
        adjacents.add(vVertex);
    }

}
