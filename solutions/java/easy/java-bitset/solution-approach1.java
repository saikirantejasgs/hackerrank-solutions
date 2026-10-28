// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true
// Problem     Java BitSet
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:10 a.m.
// Technique   bitset-array-mapping
// Time        O(M * N/W)
// Space       O(N)
// Insight     The implementation maps BitSet indices 1 and 2 to an array of size 3, allowing direct access to the target BitSet for each operation.
// Interview   Before: "How would you manage two separate BitSets and perform operations on them dynamically?" After: "I used an array of BitSets to index them by their ID, achieving O(M * N/W) time complexity where W is the word size, ensuring efficient bitwise manipulation for each of the M operations."
// Pitfalls    (1) Confusing the BitSet index (1 or 2) with the bit position index in operations like SET or FLIP.  (2) Assuming the BitSet size is fixed, whereas Java's BitSet grows dynamically if an index exceeds the initial capacity.  (3) Failing to use cardinality() to retrieve the count of set bits after each operation as required by the output format.
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
