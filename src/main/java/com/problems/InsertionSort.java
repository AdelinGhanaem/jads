package com.problems;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class InsertionSort implements SortAlgorithm {
	  
	

  @Override
  public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
    int j;

    int swapsCount = 0;

    for (int p = 1; p < unsortedArray.length; p++) {


      //only needed for clarification

      //temporary
      T tmp = unsortedArray[p];

      for (j = p; j > 0; j--) {
        T prevTemp = unsortedArray[j - 1];

        if (tmp.compareTo(prevTemp) < 0) {

          swapsCount++;

          unsortedArray[j] = unsortedArray[j - 1];
        } else {
          break; // break the loop when the element finds its way !!!
        }
      }
      unsortedArray[j] = tmp;
    }


    return unsortedArray;
  }
}
