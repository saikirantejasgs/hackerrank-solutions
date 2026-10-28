// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
// Problem     Pattern Syntax Checker
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:14 a.m.
// Technique   regex-compilation-try-catch
// Time        O(N * M)
// Space       O(M)
// Insight     The solution leverages the Java Pattern.compile method to validate regex syntax by catching PatternSyntaxException during the compilation process.
// Pitfalls    (1) Failing to handle the PatternSyntaxException will cause the program to crash on invalid regex patterns.  (2) Using next() instead of nextLine() will incorrectly skip whitespace characters that are part of the regex pattern.
// ──────────────────────────────────────────────────

import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}
