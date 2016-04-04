package com.grapth.course;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/24/16.
 */
public class Vertex<T> {

    private T t;

    public Vertex(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
