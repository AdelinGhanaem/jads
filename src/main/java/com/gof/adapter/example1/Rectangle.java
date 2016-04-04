package com.gof.adapter.example1;

import com.gof.adapter.Shape;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Height: " + height + " Width:" + width);
    }
}
