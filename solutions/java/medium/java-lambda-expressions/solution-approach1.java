// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true
// Problem     Java Lambda Expressions
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-31, 10:00 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return new PerformOperation() {
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
    }

    public static PerformOperation isPrime() {
        return new PerformOperation() {
            public boolean check(int a) {
                if (a < 2) return false;
                for (int i = 2; (long) i * i <= a; i++) {
                    if (a % i == 0) return false;
                }
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome() {
        return new PerformOperation() {
            public boolean check(int a) {
                String s = Integer.toString(a);
                return new StringBuilder(s).reverse().toString().equals(s);
            }
        };
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
