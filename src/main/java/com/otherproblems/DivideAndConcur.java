package com.otherproblems;

/**
	* @author Adelin Ghanayem adelin.ghanaem@effortel.com
	*/
public class DivideAndConcur {

	int count(int[] array) {
		return countInversions(array, 0, array.length);

	}


	private int countInversions(int[] ints, int start, int end) {
		int total = 0;
		if (end - start > 2) {
			int pivot = (start + end) / 2;
			int left = countInversions(ints, start, pivot);
			int right = countInversions(ints, pivot + 1, end);
			total = left + right;
		}


		for (int i = start; i < end; i++) {
			if (ints[i] > ints[i + 1]) {
				total++;
			}
		}
		return total;
	}

}
