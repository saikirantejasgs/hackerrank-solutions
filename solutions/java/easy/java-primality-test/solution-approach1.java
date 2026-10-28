// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
// Problem     Java Primality Test
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:37 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine().trim());
        scanner.close();

        System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");
    }
}
