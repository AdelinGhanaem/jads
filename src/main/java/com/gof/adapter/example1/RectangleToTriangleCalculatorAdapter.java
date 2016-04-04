package com.gof.adapter.example1;

import com.gof.adapter.Triangle;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class RectangleToTriangleCalculatorAdapter implements TriangleCalculator {


    private DefaultCalculator defaultCalculator = new DefaultCalculator();


    @Override
    public int getArea(Triangle triangle) {
        Rectangle rectangle = new Rectangle(triangle.getBase(), (int) (triangle.getHeight() * 0.5));
        return defaultCalculator.area(rectangle);
    }
}
