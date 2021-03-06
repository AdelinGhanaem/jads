package com.sorting;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public interface SortAlgorithm {


  /**
   * Sorts the provided array
   *
   * @param <T>
   * @return
   */
  <T extends Comparable<? super T>> T[] sort(T[] unsortedArray);



}
