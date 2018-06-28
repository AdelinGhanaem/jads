package com.heap;

public class MaxArrayPriorityQueue implements PriorityQueue<Integer> {


    private int[] nodes;
    private int heapSize = 0;

    public MaxArrayPriorityQueue(int initialCapacity) {
        nodes = new int[initialCapacity];
    }

    /* swing operation !

     5 7 9 10
     -> 7
     7 5
     -> 9
     9 5 7
     -> 10
     9 10 7 5
     10 9 7 5
    */


    /* sink operation !
     0 1 2 3 4
      10 9 7 5

     0 1 2 3 4
       5 9 7 5

     0 1 2 3 4
       9 5 7 0


     */


    @Override
    public void insert(Integer integer) {
        nodes[++heapSize] = integer;
        swim(heapSize);
    }

    @Override
    public Integer delMax() {
        int max = nodes[1];
        nodes[1] = nodes[heapSize--];
        sink(1);
        return max;
    }

    private void swim(int currentIndex) {
        while (currentIndex > 1 && nodes[currentIndex] > nodes[currentIndex / 2]) {
            exchange(currentIndex, currentIndex / 2);
            currentIndex = currentIndex / 2; // this is how we go up !
        }
    }

    private void sink(int currentIndex) {
        while (currentIndex * 2 <= heapSize) { // we check if we reached the end of the heap !

            int swapWith = currentIndex * 2;

            if (nodes[currentIndex * 2] < nodes[currentIndex * 2 + 1]) // if however the right child is bigger than the left
                swapWith++; // we try to swap with the right instead of left

            if (nodes[swapWith] > nodes[currentIndex])
                exchange(swapWith, currentIndex);
            else
                break;

            currentIndex++;
        }
    }

    @Override
    public boolean isEmpty() {
        return nodes[1] == 0;
    }

    @Override
    public Integer max() {
        return nodes[1];
    }

    @Override
    public int size() {
        return heapSize;
    }


    private void exchange(int a, int b) {
        nodes[a] = nodes[a] - nodes[b];
        nodes[b] = nodes[a] + nodes[b];
        nodes[a] = nodes[b] - nodes[a];
    }


}
