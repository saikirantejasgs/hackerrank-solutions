// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true
// Problem     Prime Checker
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:15 a.m.
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
