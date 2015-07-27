package com.sorting;

import com.problems.ShellSort;
import com.problems.SortAlgorithm;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class ShellSortTest extends SortAlgorithmContractTest {


  @Override
  protected SortAlgorithm create() {
    return new ShellSort();
  }




}
