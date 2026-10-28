// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
// Problem     Java Factory Pattern
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:17 a.m.
// ──────────────────────────────────────────────────


            if (order.equalsIgnoreCase("cake")) {
                return new Cake();
            } else if (order.equalsIgnoreCase("pizza")) {
                return new Pizza();
            }
            return null;
