package com.problems;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class FastFailIteration {


    public static void main(String[] strings) {
        Map<String, String> premiumPhone = new ConcurrentHashMap<String, String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung", "S5");

        Iterator iterator = premiumPhone.keySet().iterator();


        while (iterator.hasNext()) {

            String s = premiumPhone.get(iterator.next());
            if(s.equals("HTC")){
                premiumPhone.put("SOMETHING", "THAT IS MODIFYING THE COLLECTIONS");
            }

            System.out.println(s);

        }

    }
}
