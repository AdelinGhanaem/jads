package com.sorting;

import static com.sorting.ArrayHelp.exch;
import static com.sorting.ArrayHelp.less;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 9/16/15.
 */
public class KnuthIncrementSequenceShellSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] unsortedArray) {
        System.out.println("length: "+unsortedArray.length);
        int n = unsortedArray.length;
        int h = 1;

        h = getKunthsH(n, h);

        while (h >= 1) {

            System.out.print("h:" + h+" ");
            for (int i = h; i < n; i++) {

                for (int j = i; j >= h && less(unsortedArray[j], unsortedArray[j - h]); j -= h) {

                    exch(unsortedArray, j, j - h);

                }

            }
            h = h / 3;

        }
        return null;
    }

    private int getKunthsH(int n, int h) {
        while (h < n/2) {
            h = 3 * h + 1;
            System.out.print(h + " - \n");

        }

        return h;
    }

}
