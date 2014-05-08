package com.jads;

import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class Iterators {


  @Test(expected = ConcurrentModificationException.class)
  public void concurrentModification() throws Exception {

    List<String> simpleList = new ArrayList<String>();

    for (int index = 0; index < 100; index++) {
      simpleList.add("someValue " + index);
    }

    int index = 0;
    for (String s : simpleList) {
      if (index == 10) {
        simpleList.remove(s);
      }
      index++;

      System.out.println("asdasd");

    }


  }


  @Test
  public void useIteratorRemoveMethod() {
    List<String> simpleList = new ArrayList<String>();
    for (int index = 0; index < 100; index++) {
      simpleList.add("someValue " + index);
    }
    simpleList.remove("someValue1");


    Iterator<String> stringIterator = simpleList.iterator();

    int index = 0;

    while (stringIterator.hasNext()) {

      System.out.println(stringIterator.next());
      if (index == 10) {
        stringIterator.remove();
      }

      index++;
    }


  }

  @Test
  public void removeElementFromArrayList() {
    int index = 3;//remove the fourth element

    Integer[] elementData = new Integer[]{10, 2, 5, 4, 8, 8, 7, 8, 9, 10};
    int size = elementData.length;

    int numMoved = size - index - 1;
    if (numMoved > 0)
      System.arraycopy(elementData, index + 1, elementData, index, numMoved);
    elementData[--size] = null;
    System.out.println();


//    int numMoved = size - index - 1;
//    if (numMoved > 0)
//      System.arraycopy(elementData, index+1, elementData, index,
//              numMoved);
//    elementData[--size] = null; // Let gc do its work


  }

  @Test
  public void addToArrayList() {
    List<String> arrayList = new ArrayList<String>();
    List<String> linkedList = new LinkedList<String>();

//    arrayList.add();

  }


}
