package com;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/18/15.
 */
public class Outer {


    public  class Inner {

    }


    public Inner inner(){
        return new Inner();
    }

    @Override
    protected void finalize() throws Throwable {
    // as you know finalize is called by the garbage collector due to destroying an object instance
        System.out.println("I am destroyed !");
    }
}
