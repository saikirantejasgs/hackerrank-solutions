// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
// Problem     Java Factory Pattern
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:17 a.m.
// Technique   factory-pattern-conditional-instantiation
// Time        O(1)
// Space       O(1)
// Insight     The factory method uses case-insensitive string comparison to determine which concrete implementation of the Food interface to instantiate and return.
// Interview   Before: "How do you decouple object creation from the client?" After: "By using a factory class, we encapsulate instantiation logic. This implementation runs in O(1) time and O(1) space, returning a new Pizza or Cake object based on the input string."
// Pitfalls    (1) Failing to handle null or unexpected input strings that do not match 'pizza' or 'cake'.  (2) Assuming case-sensitive input when the problem requires case-insensitive matching via equalsIgnoreCase.
// ──────────────────────────────────────────────────


            if (order.equalsIgnoreCase("cake")) {
                return new Cake();
            } else if (order.equalsIgnoreCase("pizza")) {
                return new Pizza();
            }
            return null;
