// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
// Problem     Java 2D Array
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:56 a.m.
// Technique   nested-loop-sliding-window
// Time        O(1)
// Space       O(1)
// Insight     The algorithm iterates through all possible 3x3 subgrids within the fixed 6x6 matrix to calculate the hourglass sum using a sliding window approach.
// Interview   Before: "How would you find the maximum hourglass sum in a 6x6 grid?" After: "I iterate through the top-left corners of all possible 3x3 hourglasses, which are indices 0 to 3 for both rows and columns, resulting in O(1) time and space complexity for this fixed-size input."
// Pitfalls    (1) Incorrect loop bounds for the 3x3 hourglass pattern, which must stop at index 3 to avoid ArrayIndexOutOfBoundsException.  (2) Initializing the maximum sum variable to zero instead of Integer.MIN_VALUE, which fails when all hourglass sums are negative.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
