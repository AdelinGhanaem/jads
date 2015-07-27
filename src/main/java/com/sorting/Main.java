package com.sorting;

public class Main {

	public static void main(String[] args) {

		InversionsCounter algorithm = new InversionsCounter();
		Integer[] integer = new Integer[]{6,5,4,3,2,1};
		Integer count = algorithm.count(integer);
		System.out.print(count);

	}

}
