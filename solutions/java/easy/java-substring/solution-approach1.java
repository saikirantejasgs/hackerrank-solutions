// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
// Problem     Java Substring
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 11:37 p.m.
// Technique   java-string-substring-method
// Time        O(k) where k is the length of the subst…
// Space       O(k) to store the resulting substring
// Insight     The Java String substring method extracts characters from the start index inclusive to the end index exclusive, matching the problem's requirement for an inclusive range by using the provided end index as the exclusive boundary.
// Interview   Before: "I would manually iterate through the string to collect characters between the indices." After: "Using the built-in substring method is more efficient, operating in O(k) time where k is the length of the substring, while correctly handling the exclusive end index requirement."
// Pitfalls    (1) Confusing the inclusive end index in the problem description with the exclusive end index required by the Java substring method.  (2) Failing to account for potential StringIndexOutOfBoundsException if the provided start or end indices fall outside the string's valid range.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        System.out.println(s.substring(start, end));
    }
}
