package com;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/17/16.
 */
public final class Player { // 100% immutable


    private final String name;
    private final int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
