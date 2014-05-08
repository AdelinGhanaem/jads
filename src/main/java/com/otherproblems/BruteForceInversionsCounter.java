package com.otherproblems;

/**
	* @author Adelin Ghanayem adelin.ghanaem@effortel.com
	*/
public class BruteForceInversionsCounter {


	int count(int[] array) {
		if (array.length < 2) {
			return 0;
		}

		int inversions = 0;

		int i = 0;

		while (i < array.length) {
			int j = i + 1;
			while (j < array.length) {
				if (array[i] > array[j]) {
					inversions++;
				}
				j++;
			}
			i++;
		}
		return inversions;
	}


}
