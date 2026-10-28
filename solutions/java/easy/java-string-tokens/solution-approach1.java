// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:13 a.m.
// Technique   regex-split-trimming
// Time        O(N)
// Space       O(N)
// Insight     The implementation removes leading non-alphabetic characters to prevent empty tokens before splitting the string by any sequence of non-alphabetic characters.
// Interview   Before: "I will split the string directly using the regex." After: "Direct splitting creates empty tokens for leading delimiters, so I trim the prefix first. This approach runs in O(N) time and space, correctly handling empty inputs by checking the string length after trimming."
// Pitfalls    (1) Failing to trim leading non-alphabetic characters causes the split method to return an empty string as the first element.  (2) Neglecting the empty string case after trimming leads to printing 1 instead of 0 for inputs containing only delimiters.  (3) Using an incorrect regex pattern that fails to capture all non-alphabetic characters defined in the problem statement.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.hasNextLine() ? scan.nextLine() : "";
        scan.close();

        // remove leading delimiters so split() doesn't produce an empty first token
        s = s.replaceAll("^[^A-Za-z]+", "");

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");

        StringBuilder sb = new StringBuilder();
        sb.append(tokens.length).append("\n");
        for (String t : tokens) {
            sb.append(t).append("\n");
        }
        System.out.print(sb);
    }
}
