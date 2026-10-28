// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
// Problem     Java Substring
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 11:37 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        System.out.println(s.substring(start, end));
    }
}
