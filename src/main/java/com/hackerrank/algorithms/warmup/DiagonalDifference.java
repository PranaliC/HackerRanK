package com.hackerrank.algorithms.warmup;

import java.util.List;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * <p>
 * For example, the square matrix  is shown below:
 * <p>
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
 * <p>
 * Function description
 * <p>
 * Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.
 * <p>
 * diagonalDifference takes the following parameter:
 * <p>
 * arr: an array of integers .
 * Input Format
 * <p>
 * The first line contains a single integer, , the number of rows and columns in the matrix .
 * Each of the next  lines describes a row, , and consists of  space-separated integers .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the absolute difference between the sums of the matrix's two diagonals as a single integer.
 * <p>
 * Sample Input
 * <p>
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * Sample Output
 * <p>
 * 15
 * Explanation
 * <p>
 * The primary diagonal is:
 * <p>
 * 11
 * 5
 * -12
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 * <p>
 * The secondary diagonal is:
 * <p>
 * 4
 * 5
 * 10
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 * <p>
 * Note: |x| is the absolute value of x
 */

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            primarySum = primarySum + arr.get(i).get(n - 1 - j);
            secondarySum = secondarySum + arr.get(i).get(j);
        }
        return Math.abs(primarySum - secondarySum);
    }
}
