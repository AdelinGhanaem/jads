package com.otherproblems;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 7/7/15.
 */
public class MatricesMultiplication {


    public static void main(String[] args) {

        int[][] a = new int[][]{
                {1, 2},
                {4, 5}};

        int[][] b = new int[][]{
                {3, 2},
                {8, 10}};

        int[][] result = new int[2][2];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {


                int[] aRow = a[i];
                int[] bRow = b[j];
                int currentCellResult = 0;
                for (int k = 0; k < aRow.length; k++) {
                    currentCellResult =+ aRow[k] * bRow[k];
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
