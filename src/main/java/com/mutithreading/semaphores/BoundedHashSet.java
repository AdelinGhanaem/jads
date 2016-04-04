package com.mutithreading.semaphores;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/25/15.
 */
public class BoundedHashSet {


    public static void main(String[] args) {


    }

    class BoundedHashSetImpl<T> {


        private Set<T> set;
        private Semaphore semaphore;

        public BoundedHashSetImpl(int size) {
            set = Collections.synchronizedSet(new HashSet<T>(size));
        }


        public boolean add(T t) {

            try {
                semaphore.acquire();
                return set.add(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
            return false;
        }


    }
}
