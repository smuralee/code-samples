package com.smuralee.matrix;

public class Solution {

    /**
     * <p>
     *     For an array row [1,2,3] - The flip will be 1 to 3, 3 to 1 and 2 is static<br/>
     *     For and array row [1,2,3,4] - The flip is 1 to 4, 4 -1 and 2 to 3, 3 to 2<br/>
     *     For and array row [1,2,3,4,5] - The flip is 1 to 5, 5 -1 ; 2 to 4, 4 to 2 and 3 is static<br/>
     *     <br/>
     *     Number of flips = row length/2<br/>
     *     For even number of elements [4], all flip [2 flips]<br/>
     *     For odd number of elements [5], centre is untouched [2 flips]<br/>
     *     <br/>
     *     The loop on the row will be (int i = 1; i <= row.length / 2; i++)<br/>
     *     Initializing with i=1 since we need the index is, row.length -1<br/>
     * </p>
     * @param mat - matrix for flipping
     * @return the matrix after horizontal flip
     */
    public int[][] flip_matrix_horizontally(int[][] mat) {

        int tempVar;
        for (int[] row : mat) {
            for (int i = 1; i <= row.length / 2; i++) {
                tempVar = row[row.length - i];
                row[row.length - i] = row[i - 1];
                row[i - 1] = tempVar;
            }
        }
        return mat;
    }
}
