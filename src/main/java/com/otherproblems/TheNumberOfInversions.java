package com.otherproblems;

/**
	* @author Adelin Ghanayem adelin.ghanaem@effortel.com
	*/
public class TheNumberOfInversions {

	public static void main(String[] args) {

		int[] array = new int[]{6,5,4,3,2,1};

		System.out.println(new BruteForceInversionsCounter().count(array));
		System.out.println(new DivideAndConcur().count(array));




	}
}
