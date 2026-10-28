// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
// Problem     Java Comparator
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:05 a.m.
// Technique   custom-comparator-implementation
// Time        O(N log N)
// Space       O(log N)
// Insight     The comparator prioritizes descending order for scores using Integer.compare and falls back to ascending lexicographical order for names when scores are equal.
// Interview   Before: "How do you sort objects with multiple criteria?" After: "Implement the Comparator interface to define a primary descending sort on score and a secondary ascending sort on name, resulting in O(N log N) time complexity for the sorting algorithm."
// Pitfalls    (1) Swapping the arguments in Integer.compare(b.score, a.score) incorrectly would result in ascending score order instead of the required descending order.  (2) Using a.name.compareTo(b.name) incorrectly would reverse the alphabetical order if the logic were swapped to b.name.compareTo(a.name).  (3) Failing to handle the equality case for scores would lead to non-deterministic sorting behavior for players with identical scores.
// ──────────────────────────────────────────────────



class Checker implements Comparator<Player> {

    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);   // higher score first
        }
        return a.name.compareTo(b.name);                // then name A to Z
    }
}

