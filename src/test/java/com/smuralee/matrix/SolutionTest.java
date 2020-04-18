package com.smuralee.matrix;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.spy;

class SolutionTest {

    private static Solution solution;

    @BeforeAll
    static void setup() {
        solution = spy(Solution.class);
    }

    @Test
    @DisplayName("GIVEN a matrix, THEN flip the elements horizontally")
    void flip_matrix_horizontally() {

        int[][] given = new int[][]{
                {1, 2, 3, 11},
                {4, 5, 6, 14},
                {7, 8, 9, 17},
                {10, 20, 30, 40}
        };
        int[][] expected = new int[][]{
                {11, 3, 2, 1},
                {14, 6, 5, 4},
                {17, 9, 8, 7},
                {40, 30, 20, 10}
        };

        int[][] response = solution.flip_matrix_horizontally(given);
        assertArrayEquals(expected, response);

    }

    @Test
    @DisplayName("GIVEN a matrix, THEN transpose the matrix")
    void transpose_matrix() {

        int[][] given = new int[][]{
                {1, 2, 3, 11},
                {4, 5, 6, 14},
                {7, 8, 9, 17},
                {10, 20, 30, 40}
        };
        int[][] expected = new int[][]{
                {1, 4, 7, 10},
                {2, 5, 8, 20},
                {3, 6, 9, 30},
                {11, 14, 17, 40}
        };

        int[][] response = solution.transpose_matrix(given);
        assertArrayEquals(expected, response);
    }
}
