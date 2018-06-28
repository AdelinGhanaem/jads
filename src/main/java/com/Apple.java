package com;

import java.util.HashMap;
import java.util.TreeSet;

public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Apple))
            return false;
        if (obj == this)
            return true;
        return this.color.equals(((Apple) obj).color);
    }

    public static void main(String[] args) {


        TreeSet treeSet = new TreeSet();

        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");

        //hashMap stores apple type and its quantity
        HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
        m.put(null, new Integer(1));

        m.put(a1, 10);
        m.put(a2, 20);
        System.out.println(m.get(null));
    }
}