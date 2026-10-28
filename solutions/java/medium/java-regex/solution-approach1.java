// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
// Problem     Java Regex
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:18 a.m.
// Technique   regex-pattern-composition
// Time        O(N)
// Space       O(1)
// Insight     The implementation defines a reusable regex component for a single octet and concatenates it four times with literal dot separators to enforce the A.B.C.D structure.
// Interview   Before: "How would you validate an IP address using regex?" After: "I would construct a pattern for a single 0-255 octet and repeat it four times. This approach ensures O(N) time complexity relative to the input string length while strictly adhering to the 0-255 range constraint for each segment."
// Pitfalls    (1) Failing to escape the dot character, which acts as a wildcard in regex, leads to matching any character instead of a literal period.  (2) Incorrectly ordering the octet regex components, such as placing \d{1,2} after 25[0-5], can cause partial matches for invalid numbers like 256.  (3) Omitting start and end anchors in the full pattern allows the regex to match substrings within invalid inputs instead of validating the entire string.
// ──────────────────────────────────────────────────


class MyRegex {
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
