// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true
// Problem     Prime Checker
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:15 a.m.
// Technique   varargs-prime-trial-division
// Time        O(N * sqrt(M))
// Space       O(N)
// Insight     The implementation uses variable arguments to process an arbitrary number of integers, applying trial division up to the square root of each number to determine primality.
// Interview   Before: "I would use a boolean array for a sieve." After: "Since the input size is small and the numbers are provided as varargs, trial division is efficient with O(N * sqrt(M)) time complexity, where N is the count of numbers and M is the maximum value."
// Pitfalls    (1) Using an inefficient loop limit instead of d * d <= n, which increases the time complexity unnecessarily.  (2) Incorrectly formatting the output by failing to append a space after each prime number.
// ──────────────────────────────────────────────────


import static java.lang.System.in;
class Prime {
    public void checkPrime(int... nums) {
        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            if (n < 2) {
                continue;
            }
            boolean prime = true;
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sb.append(n).append(" ");
            }
        }
        System.out.println(sb);
    }
}
