// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
// Problem     Java Interface
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:26 a.m.
// ──────────────────────────────────────────────────



class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
