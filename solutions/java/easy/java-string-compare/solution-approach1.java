// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
// Problem     Java Substring Comparisons
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:01 a.m.
// Technique   sliding-window-lexicographical-comparison
// Time        O(n * k)
// Space       O(k)
// Insight     The algorithm maintains the lexicographical minimum and maximum substrings by iterating through all possible windows of length k and updating the tracking variables based on string comparison results.
// Interview   Before: "I would sort all substrings of length k and pick the first and last." After: "Sorting takes O(n * k * log n), but we can achieve O(n * k) by tracking the min and max during a single linear scan of the string."
// Pitfalls    (1) The loop condition i <= s.length() - k is critical to ensure the substring index i + k does not exceed the string length.  (2) Initializing smallest and largest with the first substring assumes the string length is at least k, which is implied by the problem constraints.
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
