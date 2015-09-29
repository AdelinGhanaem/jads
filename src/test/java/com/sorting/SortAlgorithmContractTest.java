//package com.sorting;
//
//import com.problems.SortAlgorithm;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//
///**
// * @author Adelin Ghanayem adelin.ghanaem@clouway.com
// */
//public abstract class SortAlgorithmContractTest {
//
//
//  private SortAlgorithm algorithm;
//
//
//  protected abstract SortAlgorithm create();
//
//
//  @Before
//  public void setUp() throws Exception {
//    algorithm = create();
//
//  }
//
//  @Test
//  public void sort() throws Exception {
//
//    Integer[] unsorted = new Integer[]{10, 532, 9, 100, 58, 23, 21, 31, 1001, 581, 231};
//
//    Integer[] sorted = new Integer[]{9, 10, 21, 23, 31, 58, 100, 231,  532,581, 1001};
//
//    Integer[] expected = algorithm.sort(unsorted);
//
//    assertThat(expected, is(equalTo(sorted)));
//
//
//  }
//
//
//}
