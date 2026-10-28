// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:09 a.m.
// Technique   frequency-array-counting
// Time        O(n)
// Space       O(1)
// Insight     The algorithm verifies anagram status by incrementing counts for characters in the first string and decrementing for the second, ensuring all final frequencies are zero.
// Interview   Before: "I would sort both strings and compare them." After: "Sorting takes O(n log n), but using a frequency array reduces this to O(n) time and O(1) space, as the alphabet size is constant at 26."
// Pitfalls    (1) Failing to check if string lengths are equal before processing, which causes index out of bounds errors.  (2) Assuming the input contains only lowercase letters without normalizing case, violating the case-insensitive requirement.  (3) Using an array size smaller than 26, which leads to ArrayIndexOutOfBoundsException for characters like 'z'.
// ──────────────────────────────────────────────────


    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] counts = new int[26];
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i) - 'a']++;
            counts[b.charAt(i) - 'a']--;
        }

        for (int c : counts) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
