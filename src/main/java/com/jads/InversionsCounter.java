package com.jads;

/**
	* @author Adelin Ghanayem adelin.ghanaem@effortel.com
	*/
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


		while (i <= left.length - 1) {
			objects[k] = left[i];
			k++;
			i++;
		}

		while (j <= right.length - 1) {
			objects[k] = right[j];
			k++;
			j++;
		}
		return (T[]) objects;
	}

}
