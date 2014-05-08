package com.jads;


public class MyInsertionSort implements SortAlgorithm {
	@Override
	public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {


		for (int i = 1; i < unsortedArray.length; i++) {


			for (int j = i; j > 0; j--) {


				if (unsortedArray[j].compareTo(unsortedArray[j - 1]) < 0) {//unordered element

					T temp = unsortedArray[j - 1];

					unsortedArray[j - 1] = unsortedArray[j];

					unsortedArray[j] = temp;

				} else{
					break;
				}

			}

		}
		return unsortedArray;

	}
}
