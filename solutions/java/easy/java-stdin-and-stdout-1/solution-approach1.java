// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
// Problem      Java Stdin and Stdout I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 10:45 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
