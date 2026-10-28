// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:06 a.m.
// Technique   string-builder-reverse-comparison
// Time        O(n)
// Space       O(n)
// Insight     The implementation determines if a string is a palindrome by comparing the original sequence to its reversed counterpart generated via the StringBuilder class.
// Interview   Before: "I would iterate from both ends using two pointers to check for equality." After: "Using StringBuilder.reverse() is more concise, though it requires O(n) space to store the reversed string, whereas a two-pointer approach would achieve O(1) auxiliary space complexity."
// Pitfalls    (1) Using the == operator instead of the .equals() method will compare object references rather than the actual character sequences.  (2) Failing to handle potential null input if the problem constraints allowed it, though the current constraints specify lower case English letters.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        String reversed = new StringBuilder(A).reverse().toString();

        System.out.println(A.equals(reversed) ? "Yes" : "No");
    }
}
