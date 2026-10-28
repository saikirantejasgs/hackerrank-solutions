// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
// Problem     Java BigDecimal
// Difficulty  Medium
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:35 a.m.
// ──────────────────────────────────────────────────



        Arrays.sort(s, 0, n, new Comparator<String>() {
    public int compare(String a, String b) {
        return new java.math.BigDecimal(b).compareTo(new java.math.BigDecimal(a));
    }
});

