package com.heap;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(Main.class.getResourceAsStream("/input01.txt"));


    static MinHeap minHeap;
    static MaxHeap maxHeap;

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        minHeap = new MinHeap(n);
        maxHeap = new MaxHeap(n);

        // the first element is the mid one, so we print it as it.
        double mid = -1;
        for (int i = 0; i < n ; i++) {
            int aItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (isArraySizeEven()) {// if even and we add one element it becomes odd

                if (aItem > mid) {
                    minHeap.add(aItem);
                    mid = getMinRight();
                } else {
                    maxHeap.add(aItem);
                    mid = getMaxLeft();
                }
            } else {


                // if odd and we add one element it becomes even !
                if (aItem > mid) {
                    if (minHeap.size() > maxHeap.size()) {
                        maxHeap.add(minHeap.poll());
                    }
                    minHeap.add(aItem);
                } else if (aItem < mid) {
                    if (maxHeap.size() > minHeap.size()) {
                        minHeap.add(maxHeap.poll());
                    }
                    maxHeap.add(aItem);
                } else if (aItem == mid) {
                    if (maxHeap.size() > minHeap.size()) {
                        minHeap.add(aItem);
                    } else {
                        maxHeap.add(aItem);
                    }
                }
                mid = getAverage();
            }


            System.out.println(mid);
        }

        scanner.close();
    }


    private static int getMinRight() {
        return minHeap.peak();
    }

    private static int getMaxLeft() {
        return maxHeap.peak();
    }

    // returns the size of both heaps which equals the size of the logical array
    private static int arraySize() {
        return minHeap.size() + maxHeap.size();
    }

    private static boolean isArraySizeEven() {
        return (arraySize() & 1) == 0;
    }

    private static double getAverage() {
        return (getMaxLeft() + getMinRight()) / 2d;
    }


    public static class MaxHeap {


        private int[] ints;

        private int size = 0;

        public MaxHeap(int capacity) {
            ints = new int[capacity];
        }


        public void add(int element) {
            ints[size] = element;
            int i = size;
            while (i >= 0) {
                if (ints[i] > ints[(i - 1) / 2]) {
                    swap(ints, i, (i - 1) / 2);
                } else {
                    break;
                }
                i = (i - 1) / 2;
            }
            size++;
        }


        public int poll() {
            int i = ints[0];
            ints[0] = ints[--size];

            int k = 0;
            while (k * 2 + 2 <= size) {
                if (ints[k * 2 + 1] > ints[k * 2 + 2]) {
                    if (ints[k * 2 + 1] > ints[k])
                        swap(ints, k, k * 2 + 1);
                } else {
                    if (ints[k * 2 + 2] > ints[k])
                        swap(ints, k, k * 2 + 2);
                }
                k = k * 2 + 2;
            }
            return i;
        }

        public int peak() {
            return ints[0];
        }

        private void swap(int[] array, int a, int b) {
            int tmp = array[a];
            array[a] = array[b];
            array[b] = tmp;
        }

        public int size() {
            return size;
        }
    }


    public static class MinHeap {


        private int[] ints;

        private int size = 0;

        public MinHeap(int capacity) {
            ints = new int[capacity];
        }


        public void add(int element) {
            ints[size] = element;
            int i = size;
            while (i >= 0) {
                if (ints[i] < ints[(i - 1) / 2]) {
                    swap(ints, i, (i - 1) / 2);
                } else {
                    break;
                }
                i = (i - 1) / 2;
            }
            size++;
        }


        public int poll() {
            int i = ints[0];
            ints[0] = ints[--size];

            int k = 0;

            while (k * 2 + 2 <= size) {
                if (ints[k * 2 + 1] < ints[k * 2 + 2]) {
                    if (ints[k * 2 + 1] < ints[k])
                        swap(ints, k, k * 2 + 1);
                } else {
                    if (ints[k * 2 + 2] < ints[k])
                        swap(ints, k, k * 2 + 2);
                }
                k = k * 2 + 2;
            }
            return i;
        }


        public int peak() {
            return ints[0];
        }

        private void swap(int[] array, int a, int b) {
            array[a] = array[a] + array[b];
            array[b] = array[a] - array[b];
            array[a] = array[a] - array[b];
        }

        public int size() {
            return size;
        }

    }


}
