package com.sorting;


public class InversionsCounter {


	public <T extends Comparable<? super T>> int count(T[] unsortedArray) {
//		T[] tmpArray = (T[]) new Comparable[unsortedArray.length];

		return mergeSort(unsortedArray, 0, unsortedArray.length - 1);
//		sortArray(unsortedArray, tmpArray, 0, unsortedArray.length);
	}

	private <T extends Comparable<? super T>> int mergeSort(T[] unsortedArray, int left, int right) {


		if (left < right) {

			int center = (left + right) / 2;

			int leftInversions = mergeSort(unsortedArray, left, center);

			int rightInversions = mergeSort(unsortedArray, center + 1, right);

			int split = merge(unsortedArray, left, center, right);

			return leftInversions + rightInversions + split;
		}
		return 0;
	}

	private <T extends Comparable<? super T>> int merge(T[] unsortedArray, int left, int center, int right) {
		int rightStart = right;
		int inversion = 0;

		while (rightStart > center) {
			int leftStart = left;

			while (leftStart <= center) {
				if (unsortedArray[leftStart].compareTo(unsortedArray[rightStart]) > 0) {
					inversion++;
				}
				leftStart++;
			}

			rightStart--;
		}

		return inversion;
	}


}
