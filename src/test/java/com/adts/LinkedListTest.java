package com.adts;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LinkedListTest {


    private List<Integer> integerList = new LinkedList<Integer>();


    @Test
    public void returnsWhatWasInserted() {

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        assertThat(integerList.get(0), is(equalTo(1)));
        assertThat(integerList.get(1), is(equalTo(2)));
        assertThat(integerList.get(2), is(equalTo(3)));

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenIndexIsOutOfBounds() {
        integerList.get(0);
    }


    @Test
    public void shouldInsertAtProvidedPosition() {
        integerList.add(1); // 0 position
        integerList.add(2); // 1 position
        integerList.add(3); // 2 position
        integerList.add(1, 2);

        assertThat(integerList.get(0), is(equalTo(1)));
        assertThat(integerList.get(1), is(equalTo(2)));
        assertThat(integerList.get(2), is(equalTo(2)));
        assertThat(integerList.get(3), is(equalTo(3)));


    }


}