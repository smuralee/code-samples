package com.smuralee.matrix;

public class Solution {

    public int[][] flip_matrix_horizontally(int[][] mat) {

        int tempVar;
        int count = 0;

        for (int[] row : mat) {
            for (int element : row) {

                count++;
                tempVar = row[row.length - count];
                row[row.length - count] = element;
                row[count - 1] = tempVar;

                if (count == row.length / 2) {
                    count = 0;
                    break;
                }
            }
        }
        return mat;
    }
}
