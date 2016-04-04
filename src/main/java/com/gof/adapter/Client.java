package com.gof.adapter;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Client {

    private List<Shape> shapeList = new ArrayList<>();


    public void draw(Shape shape) {
        shape.draw();
    }


}
