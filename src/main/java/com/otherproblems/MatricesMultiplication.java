package com.otherproblems;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 7/7/15.
 */
public class MatricesMultiplication {

    /**
     *
     *
     */
    public static void main(String[] args) {

        int[][] a = new int[][]{  // 2x2 matrix
                {1, 2},
                {4, 5}};

        int[][] b = new int[][]{        // 2x2 matrix
                {3, 2},
                {8, 10}};

        int[][] result = new int[2][2];   // 2x2 result matrix


        for (int i = 0; i < a.length; i++) {  // iterate over the first

            for (int j = 0; j < a[i].length; j++) {


                int[] aRow = a[i]; // the first
                int[] bColumn = b[j];
                int currentCellResult = 0;
                for (int k = 0; k < aRow.length; k++) {
                    // Note that it takes O(n^3) to accomplish matrices multiplication ...
                    currentCellResult =+ aRow[k] * bColumn[k];
                }
                result[i][j] = currentCellResult;
            }


        }


        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "," + j + "]=" + a[i][j] + " ");
            }
        }

        System.out.println();

    }


}
