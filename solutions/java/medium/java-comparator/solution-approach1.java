// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
// Problem     Java Comparator
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:05 a.m.
// ──────────────────────────────────────────────────



class Checker implements Comparator<Player> {

    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);   // higher score first
        }
        return a.name.compareTo(b.name);                // then name A to Z
    }
}

