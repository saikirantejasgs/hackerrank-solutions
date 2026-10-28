// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem     Java Loops II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 10:49 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int k = 0; k < q; k++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int term = a;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                term += (1 << i) * b;   // add 2^i * b
                sb.append(term);
                if (i < n - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
        in.close();
    }
}
