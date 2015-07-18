package com.problems;


public class DivideAndConquerInversionsCounter {


	public <T extends Comparable<? super T>> int count(T[] unsortedArray) {
		return count(unsortedArray, 0, unsortedArray.length - 1);
	}

	private <T extends Comparable<? super T>> int count(T[] unsortedArray, int left, int right) {


		if (left < right) {

			int center = (left + right) / 2;

			int leftInversions = count(unsortedArray, left, center);

			int rightInversions = count(unsortedArray, center + 1, right);

			int splits = merge(unsortedArray, left, center, right);

			return leftInversions + rightInversions + splits;
		}
		return 0;
	}

	private <T extends Comparable<? super T>> int merge(T[] unsortedArray, int left, int center, int right) {

        int rightStart = right;

        int inversion = 0;

		while (rightStart > center) {   // this shit is still n^2 !!!

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
