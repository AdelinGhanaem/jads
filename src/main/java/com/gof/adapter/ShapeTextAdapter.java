package com.gof.adapter;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class ShapeTextAdapter implements Shape {


    private Text text;

    @Override
    public void draw() {
        text.showText();
    }
}
