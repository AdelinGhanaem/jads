package com.concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/9/15.
 */
public class Main {


    public static class DelegatingVehicleTracker {
        private final ConcurrentMap<String, Point> locations;
        private final Map<String, Point> unmodifiableMap;

        public DelegatingVehicleTracker(Map<String, Point> points) {
            locations = new ConcurrentHashMap<String, Point>(points);
            unmodifiableMap = Collections.unmodifiableMap(locations);
        }

        public Map<String, Point> getLocations() {
            return unmodifiableMap;
        }

        public Point getLocation(String id) {
            return locations.get(id);
        }

        public void setLocation(String id, int x, int y) {
            if (locations.replace(id, new Point(x, y)) == null)
                throw new IllegalArgumentException(
                        "invalid vehicle name: " + id);
        }


    }

    public static void main(String[] args) {


        final DelegatingVehicleTracker delegatingVehicleTracker = new DelegatingVehicleTracker(new HashMap<String, Point>());

        //TODO:to change the locations

        Map<String, Point> stringPointMap = delegatingVehicleTracker.getLocations();

        Map<String, Point> map = new HashMap<>(stringPointMap);

        map.put("newEntry", new Point(3, 4));

        DelegatingVehicleTracker delegatingVehicleTracker1 = new DelegatingVehicleTracker(map);

        System.out.print(delegatingVehicleTracker1.getLocations());

        new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();

                while (true) {
                    int randomNumber = random.nextInt(10);

                    if (randomNumber % 2 == 0) {
                        try {
                            delegatingVehicleTracker.setLocation(String.valueOf(randomNumber), 30, 3);

                        } catch (IllegalArgumentException e) {
                            //TODO:add a point if doesn't exist
//                            delegatingVehicleTracker.a
                        }
                    } else {

                    }
                }
            }
        });


        new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                while (true) {

                    if (random.nextInt(10) % 2 == 0) {
                        //TODO:play with the concurrent maps !
                    } else {

                    }
                }


            }
        });
    }
}
