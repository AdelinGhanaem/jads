package com.sorting;


import com.problems.InsertionSort;
import com.problems.MyMergeSort;
import com.problems.SortAlgorithm;
import org.junit.Test;

import java.util.Random;


public class MergeSortVsInsertionSort {


	@Test
	public void merge() {

		Integer[] integers = getRandomArray(200000);

		System.out.println("Merge Sort : "+execute(integers, new MyMergeSort()).getTime());

	}


	@Test
	public void insertion() {

		Integer[] integers = getRandomArray(200000);
		System.out.println("Insertion Sort : "+execute(integers, new InsertionSort()).getTime());

	}

	private Result<Integer[]> execute(Integer[] integers, SortAlgorithm algorithm) {

		long startTime = System.currentTimeMillis();

		algorithm.sort(integers);

		long endTime = System.currentTimeMillis();

		return new Result<Integer[]>((endTime - startTime) / 1000, integers);

	}


	private Integer[] getRandomArray(int size) {


		Integer[] ints = new Integer[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			ints[i] = random.nextInt(size);
		}

		return ints;

	}

	class Result<T> {
		long time;
		T result;

		Result(long time, T result) {
			this.time = time;
			this.result = result;
		}

		public long getTime() {
			return time;
		}

		public T getResult() {
			return result;
		}
	}

}
