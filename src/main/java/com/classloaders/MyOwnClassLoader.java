package com.classloaders;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/4/16.
 */
public class MyOwnClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.out.println("Loaded class: " + name);
        return super.loadClass(name);
    }
}
