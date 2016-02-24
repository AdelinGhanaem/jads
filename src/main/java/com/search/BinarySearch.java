package com.search;

import java.util.*;

/**
 *
 * Created by adelin.ghanayem@cayetanogaming.com on 2/22/16.
 */
public class BinarySearch implements Search<String> {


    @Override
    public int search(List<String> collection, String element) {

        List<String> tList = new ArrayList<>(collection); //O(N) !!!!

        int low = 0;

        int high = collection.size() - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            int cmp = element.compareTo(tList.get(mid));
            if (cmp < 0) {
                high = mid - 1;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    @Override
    public int search(String[] collection, String element) {
        return -1;
    }
}
