package com.oop;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/29/16.
 */
public class Parent {


    private String some;

    public Parent(String some) {
        System.out.println("Parent !123123123123");
        this.some = some;
    }

    public Parent() {
        System.out.println("Parent !");
    }

    protected void doSomeThing() throws LessScopException {

    }


    B someThing() {
        return new B();
    }
}
