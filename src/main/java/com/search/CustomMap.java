package com.search;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/23/16.
 */
public interface CustomMap<K, V> {


    void put(K k, V v);

    V get(K k);

}
