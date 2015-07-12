package com.jads;


import com.problems.InsertionSort;
import com.problems.SortAlgorithm;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class InsertionSortTest extends SortAlgorithmContractTest {


  @Override
  protected SortAlgorithm create() {
    return new InsertionSort();
  }
}
