// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
// Problem     Java Substring Comparisons
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:01 a.m.
// ──────────────────────────────────────────────────


public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

    for (int i = 1; i <= s.length() - k; i++) {
        String sub = s.substring(i, i + k);
        if (sub.compareTo(smallest) < 0) {
            smallest = sub;
        }
        if (sub.compareTo(largest) > 0) {
            largest = sub;
        }
    }

    return smallest + "\n" + largest;
}
