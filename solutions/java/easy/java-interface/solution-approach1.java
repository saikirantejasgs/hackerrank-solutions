// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
// Problem     Java Interface
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:26 a.m.
// Technique   linear-scan-divisor-sum
// Time        O(n)
// Space       O(1)
// Insight     The implementation iterates through all integers from one to n, accumulating the value of each integer that divides n without a remainder.
// Interview   Before: "I will use a hash map to store divisors." After: "I implemented a linear scan O(n) approach to sum all divisors, which is efficient given the constraint n ≤ 1000."
// Pitfalls    (1) Failing to include n itself as a divisor in the sum calculation.  (2) Using an incorrect loop range that excludes n, violating the requirement to sum all divisors.  (3) Declaring the MyCalculator class as public, which violates the specific problem constraint.
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
