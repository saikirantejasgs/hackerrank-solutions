// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
// Problem     Java BigInteger
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:41 a.m.
// Technique   java-biginteger-arithmetic
// Time        O(N^1.585) to O(N^2)
// Space       O(N)
// Insight     The BigInteger class provides arbitrary-precision arithmetic, allowing the program to handle integers exceeding the capacity of primitive types by storing them as variable-length arrays of bits.
// Interview   Before: "I would use long to store these inputs." After: "Since the input can have 200 digits, I used BigInteger to prevent overflow. The time complexity for addition is O(N) and multiplication is typically O(N^1.585) using Karatsuba, where N is the number of digits."
// Pitfalls    (1) Attempting to use primitive types like long or int will cause overflow errors for inputs with up to 200 digits.  (2) Failing to close the Scanner object can lead to resource leaks in larger applications.  (3) Assuming BigInteger operations have the same constant-time performance as primitive arithmetic operations.
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
