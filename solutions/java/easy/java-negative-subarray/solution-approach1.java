// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
// Problem     Java Subarray
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:58 a.m.
// Technique   nested-loop-subarray-sum
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm iterates through every possible starting index and calculates the cumulative sum for all contiguous subarrays beginning at that index to identify those with a negative total.
// Interview   Before: "I could use a prefix sum array to optimize the sum calculation." After: "While prefix sums help, the O(n^2) nested loop is sufficient here given the constraints, as we must check every contiguous subarray to count those with negative sums."
// Pitfalls    (1) Failing to reset the sum variable to zero for each new starting index i.  (2) Incorrectly setting the inner loop boundary to n instead of n-1, which would cause an ArrayIndexOutOfBoundsException.  (3) Misinterpreting the subarray definition by failing to include single-element subarrays in the count.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
