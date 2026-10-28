// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
// Problem     Java BigInteger
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:41 a.m.
// ──────────────────────────────────────────────────

import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        sc.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
