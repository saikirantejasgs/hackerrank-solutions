// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Problem     Java End-of-file
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 10:57 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        sc.close();
    }
}
