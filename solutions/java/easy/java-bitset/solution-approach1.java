// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true
// Problem     Java BitSet
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:10 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet[] b = new BitSet[3];
        b[1] = new BitSet(n);
        b[2] = new BitSet(n);

        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (op.equals("AND")) {
                b[x].and(b[y]);
            } else if (op.equals("OR")) {
                b[x].or(b[y]);
            } else if (op.equals("XOR")) {
                b[x].xor(b[y]);
            } else if (op.equals("FLIP")) {
                b[x].flip(y);
            } else if (op.equals("SET")) {
                b[x].set(y);
            }

            sb.append(b[1].cardinality()).append(" ").append(b[2].cardinality()).append("\n");
        }
        sc.close();

        System.out.print(sb);
    }
}
