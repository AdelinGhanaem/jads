package com.oop;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/29/16.
 */
public class Child extends Parent {


    private String someOther;


    public static final boolean FUCK = true;

    protected Child(String some) {
        System.out.println("child33333333333333333333333");
    }


    public Child() {

        System.out.println("child");
    }

    private static void doSomething() {

    }

    @Override
    protected void doSomeThing() {
        try {
            super.doSomeThing();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
