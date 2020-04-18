package com.smuralee.matrix;

public class Solution {

    /**
     * <p>
     * For an array row [1,2,3] - The flip will be 1 to 3, 3 to 1 and 2 is static<br/>
     * For and array row [1,2,3,4] - The flip is 1 to 4, 4 -1 and 2 to 3, 3 to 2<br/>
     * For and array row [1,2,3,4,5] - The flip is 1 to 5, 5 -1 ; 2 to 4, 4 to 2 and 3 is static<br/>
     * <br/>
     * Number of flips = row length/2<br/>
     * For even number of elements [4], all flip [2 flips]<br/>
     * For odd number of elements [5], centre is untouched [2 flips]<br/>
     * <br/>
     * The loop on the row will be (int i = 1; i <= row.length / 2; i++)<br/>
     * Initializing with i=1 since we need the index is, row.length -1<br/>
     * </p>
     *
     * @param mat - Matrix for horizontal flip
     * @return Matrix after horizontal flip
     */
    public int[][] flip_matrix_horizontally(int[][] mat) {

        int temp;
        for (int[] row : mat) {
            for (int i = 1; i <= row.length / 2; i++) {
                temp = row[row.length - i];
                row[row.length - i] = row[i - 1];
                row[i - 1] = temp;
            }
        }
        return mat;
    }

    /**
     * <p>
     * Given matrix <br/>
     * {1, 2, 3, 11},<br/>
     * {4, 5, 6, 14},<br/>
     * {7, 8, 9, 17},<br/>
     * {10, 20, 30, 40}
     * <br/>
     * </p>
     * <br/>
     * <p>
     * Matrix positions <br/>
     * {0-0, 0-1, 0-2, 0-3},<br/>
     * {1-0, 1-1, 1-2, 1-3},<br/>
     * {2-0, 2-1, 2-2, 2-3},<br/>
     * {3-0, 3-1, 3-2, 3-3}<br/>
     * <p>
     * <br/>
     * row is 'i' and column is 'j'<br/>
     * The transpose happens at the vertex of i=j, every time j = i+1<br/>
     * The elements to transpose are to the right and bottom of i=j <br/>
     * So we flip [i][j] = [j][i]<br/>
     *
     * @param mat - Matrix to transpose
     * @return - Transposed matrix
     */
    public int[][] transpose_matrix(int[][] mat) {
        int temp;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
}
