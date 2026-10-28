// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
// Problem     Valid Username Regular Expression
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:29 a.m.
// Technique   regular-expression-pattern-matching
// Time        O(N)
// Space       O(1)
// Insight     The regular expression enforces a mandatory alphabetic start followed by seven to twenty-nine alphanumeric or underscore characters to satisfy the length constraint of eight to thirty characters.
// Interview   Before: "How would you validate a string with specific character and length constraints?" After: "I used a regex pattern to ensure the first character is alphabetic and the total length is between 8 and 30, achieving O(N) time complexity where N is the string length."
// Pitfalls    (1) Failing to account for the total length constraint of 8 to 30 characters by miscalculating the quantifier range.  (2) Including non-alphabetic characters in the first position, which violates the requirement that the username must start with an alphabetic character.  (3) Allowing special characters other than the underscore, which contradicts the allowed character set of alphanumeric characters and underscores.
// ──────────────────────────────────────────────────


class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression =  "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

