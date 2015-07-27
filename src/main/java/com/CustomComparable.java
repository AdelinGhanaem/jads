package com;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 7/24/15.
 */
public interface CustomComparable<T extends Comparable<T>> {


    boolean equals(T someComparable);

    boolean isSmallerThan();

    boolean isBiggerThan();


}
