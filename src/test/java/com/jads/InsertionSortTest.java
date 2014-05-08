package com.jads;


/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class InsertionSortTest extends SortAlgorithmContractTest {


  @Override
  protected SortAlgorithm create() {
    return new InsertionSort();
  }
}
