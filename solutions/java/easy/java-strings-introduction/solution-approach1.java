// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:04 a.m.
// Technique   string-manipulation-and-comparison
// Time        O(N + M)
// Space       O(N + M)
// Insight     The solution leverages Java's built-in String methods to compute length, perform lexicographical comparison, and capitalize substrings in linear time relative to the input string lengths.
// Interview   Before: "I would iterate through characters to compare them." After: "Using String.compareTo() is more idiomatic and efficient, running in O(N+M) time where N and M are the lengths of the strings, while handling lexicographical order correctly."
// Pitfalls    (1) Using the > operator on strings instead of compareTo() will cause a compilation error in Java.  (2) Calling substring(1) on a single-character string is valid, but calling it on an empty string would throw a StringIndexOutOfBoundsException.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);
    }
}
