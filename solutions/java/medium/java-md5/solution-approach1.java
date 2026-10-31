// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true
// Problem     Java MD5
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-31, 10:01 a.m.
// ──────────────────────────────────────────────────

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(s.getBytes("UTF-8"));

        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb.toString());
    }
}
