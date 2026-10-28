// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:09 a.m.
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
