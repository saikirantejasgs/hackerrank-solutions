// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
// Problem     Java BigDecimal
// Difficulty  Medium
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:35 a.m.
// Technique   custom-comparator-bigdecimal-sort
// Time        O(n log n * m)
// Space       O(n * m)
// Insight     The custom comparator leverages BigDecimal's compareTo method to perform a stable descending sort while preserving the original string representation of each number.
// Interview   Before: "How would you sort strings representing arbitrary-precision numbers while maintaining their original formatting?" After: "I used a custom Comparator with BigDecimal to handle numerical values, achieving O(n log n * m) time complexity, where m is the maximum number of digits, ensuring stability for equivalent values."
// Pitfalls    (1) Using standard string comparison instead of BigDecimal comparison, which fails to correctly order numbers like 0.1 and 0.10.  (2) Failing to maintain the original input order for numerically equivalent values, which violates the stability requirement.  (3) Assuming standard floating-point types can handle the arbitrary precision required by the problem constraints.
// ──────────────────────────────────────────────────



        Arrays.sort(s, 0, n, new Comparator<String>() {
    public int compare(String a, String b) {
        return new java.math.BigDecimal(b).compareTo(new java.math.BigDecimal(a));
    }
});

