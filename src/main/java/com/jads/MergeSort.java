package com.jads;


public class MergeSort implements SortAlgorithm {


	@Override
	public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
//		T[] tmpArray = (T[]) new Comparable[unsortedArray.length];

		return mergeSort(unsortedArray, 0, unsortedArray.length - 1);
//		sortArray(unsortedArray, tmpArray, 0, unsortedArray.length);
	}

	private <T extends Comparable<? super T>> T[] mergeSort(T[] unsortedArray, int left, int right) {


		if (left < right) {

			int center = (left + right) / 2;

			T[] leftSorted = mergeSort(unsortedArray, left, center);

			T[] rightSorted = mergeSort(unsortedArray, center + 1, right);

			return merge(leftSorted, rightSorted);

		}

		Comparable[] objects = new Comparable[1];

		objects[0] = unsortedArray[left];

		return (T[]) objects;
	}

	private <T extends Comparable<? super T>> T[] merge(T[] left, T[] right) {
		Comparable[] objects = new Comparable[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i <= left.length - 1 && j <= right.length - 1) {


			if (left[i].compareTo(right[j]) <= 0) {
				objects[k] = left[i];
				i++;
			} else {
				objects[k] = right[j];
				j++;
			}
			k++;
		}


		while (i <= left.length-1) {
			objects[k] = left[i];
			k++;
			i++;
		}

		while (j <= right.length-1) {
			objects[k] = right[j];
			k++;
			j++;
		}
		return (T[]) objects;
	}

}
