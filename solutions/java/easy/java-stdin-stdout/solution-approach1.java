// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Problem     Java Stdin and Stdout II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 10:46 p.m.
// Technique   scanner-buffer-clearing
// Time        O(1)
// Space       O(1)
// Insight     The scanner requires an explicit call to nextLine() after reading numeric tokens to consume the trailing newline character before reading the subsequent string input.
// Interview   Before: "How do you handle mixed input types in Java?" After: "I use Scanner's nextInt and nextDouble, then call nextLine to clear the buffer, ensuring the subsequent string read is not empty. This approach operates in O(1) time and space, correctly handling the newline character left in the buffer."
// Pitfalls    (1) Failing to consume the newline character after nextInt or nextDouble causes the subsequent nextLine call to return an empty string.  (2) Assuming nextLine reads the next token instead of the entire line including spaces.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // consume the leftover newline
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
