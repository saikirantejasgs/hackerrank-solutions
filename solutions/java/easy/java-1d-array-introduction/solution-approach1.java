// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
// Problem     Java 1D Array
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:56 a.m.
// Technique   array-initialization-and-sequential-assignment
// Time        O(n)
// Space       O(n)
// Insight     The implementation allocates a fixed-size integer array of length n and populates it by mapping each input integer to its corresponding index i in a single linear pass.
// Interview   Before: "I need to store n integers and then print them." After: "I initialize an array of size n and use a loop to map each input to index i, resulting in O(n) time and O(n) space complexity, ensuring all n elements are stored sequentially."
// Pitfalls    (1) Attempting to access an index equal to or greater than n, which triggers an ArrayIndexOutOfBoundsException.  (2) Failing to initialize the array with the size variable n before attempting to assign values to indices.  (3) Using an incorrect loop condition that fails to cover all indices from 0 to n-1.
// ──────────────────────────────────────────────────


   int[] a = new int[n];          // 1. create the array

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();     // 2. store each value at index i
        }
