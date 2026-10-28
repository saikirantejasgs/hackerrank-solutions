// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:13 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.hasNextLine() ? scan.nextLine() : "";
        scan.close();

        // remove leading delimiters so split() doesn't produce an empty first token
        s = s.replaceAll("^[^A-Za-z]+", "");

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");

        StringBuilder sb = new StringBuilder();
        sb.append(tokens.length).append("\n");
        for (String t : tokens) {
            sb.append(t).append("\n");
        }
        System.out.print(sb);
    }
}
