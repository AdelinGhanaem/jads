package com.problems;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 7/7/15.
 */
public class MatricesMultiplication {


    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        int[][] a = new int[][]{
                {1, 2, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4}
        };

        int[][] b = new int[][]{
                {3, 2, 3, 4, 4, 4, 4, 4},
                {8, 10, 3, 4, 4, 4, 4, 4},
                {4, 5, 3, 4, 4, 4, 4, 4},
                {8, 10, 3, 4, 4, 4, 4, 4},
                {8, 10, 3, 4, 4, 4, 4, 4},
                {8, 10, 3, 4, 4, 4, 4, 4},
                {8, 10, 3, 4, 4, 4, 4, 4},
                {8, 10, 3, 4, 4, 4, 4, 4}
        };

        int[][] result = new int[8][8];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {


                int[] aRow = a[i];
                int[] bRow = b[j];
                int currentCellResult = 0;
                for (int k = 0; k < aRow.length; k++) {
                    currentCellResult += aRow[k] * bRow[k];
                }
                result[i][j] = currentCellResult;
            }


        }


        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < result[i].length; j++) {
                System.out.print("a[" + i + "," + j + "]=" + result[i][j] + " ");
            }
        }

        System.out.println();

    }


}
