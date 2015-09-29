package com.sorting;

/**
 *
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class ShellSort implements SortAlgorithm {


  @Override
  public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {

//    int gap = unsortedArray.length / 2;
    for (int gap = unsortedArray.length; gap > 0; gap /= 3) {
      System.out.println("gap: " + gap);
      int j;
      //perform an insertion sort for each sublist
      for (int i = gap; i < unsortedArray.length; i++) {
        printArray(unsortedArray);

        T temp = unsortedArray[i];

        for (j = i; j >= gap && temp.compareTo(unsortedArray[j - gap]) < 0; j -= gap) {
          unsortedArray[j] = unsortedArray[j - gap];
        }

        unsortedArray[j] = temp;
      }

    }

    return unsortedArray;
  }

  private <T extends Comparable<? super T>> void insertionSort(T[] unsortedArray, int gap) {


  }

  /**
   * prints the array
   *
   * @param ts
   * @param <T>
   */
  private <T> void printArray(T[] ts) {

    for (T t : ts) {
      System.out.print("[ " + t.toString() + " ],");
    }
    System.out.println("________________________________________________________________________________________");

  }

}
