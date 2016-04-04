package com.mutithreading.collections;


import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/19/15.
 */
public class Main {


    //A list of all SYNCHRONIZED collections

    //Synchronized list
    private List<String> synchronizedSortedList = Collections.synchronizedList(new ArrayList<String>());

    //Sorted Map.
    private Map<String, String> synchronizedSortedMap = Collections.synchronizedSortedMap(new TreeMap<String, String>());

    //Map
    private Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<String, String>());

    //private Map<String,String> synchronizedSet
    private Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet<String>());

    //*** Concurrent Collection

    //CopyOnWriteArrayList / Similar to CopyOnWriteSet
    private CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();

    private BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(10);


    public static void main(String[] args) {


        Main main = new Main();
//
//        main.blockingQueue.add("add some");
//
//        try {
//
//            String s1 = main.blockingQueue.take();
//            System.out.println(s1);
//
//            String s2 = main.blockingQueue.take();
//            System.out.println(s1);
//
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }

    public List<String> getSynchronizedSortedList() {
        return synchronizedSortedList;
    }

    public Map<String, String> getSynchronizedSortedMap() {
        return synchronizedSortedMap;
    }

    public Map<String, String> getSynchronizedMap() {
        return synchronizedMap;
    }

    public Set<String> getSynchronizedSet() {
        return synchronizedSet;
    }

    public CopyOnWriteArrayList<String> getCopyOnWriteList() {
        return strings;
    }
}
