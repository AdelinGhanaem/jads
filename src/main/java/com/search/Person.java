package com.search;

import java.util.Arrays;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/22/16.
 */
public class Person {

    private String name;
    private int age;
    private double salary;
    private long id;
    private short someValue;
    private byte aByte;
    private boolean aBoolean;
    private float aFloat;
    private float[] floats  = new float[]{2,4};


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(person.salary, salary) != 0) return false;
        if (id != person.id) return false;
        if (someValue != person.someValue) return false;
        if (aByte != person.aByte) return false;
        if (aBoolean != person.aBoolean) return false;
        if (Float.compare(person.aFloat, aFloat) != 0) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return Arrays.equals(floats, person.floats);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (int) someValue;
        result = 31 * result + (int) aByte;
        result = 31 * result + (aBoolean ? 1 : 0);
        result = 31 * result + (aFloat != +0.0f ? Float.floatToIntBits(aFloat) : 0);
        result = 31 * result + (floats != null ? Arrays.hashCode(floats) : 0);
        return result;
    }
}
