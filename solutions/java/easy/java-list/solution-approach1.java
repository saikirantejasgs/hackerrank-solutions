// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
// Problem     Java List
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:43 a.m.
// Technique   array-list-dynamic-manipulation
// Time        O(Q * N)
// Space       O(N)
// Insight     The implementation leverages the dynamic resizing capabilities of the ArrayList class to perform index-based insertions and deletions while maintaining the relative order of elements.
// Interview   Before: "I would use a LinkedList to optimize insertions and deletions to O(1)." After: "Actually, for this problem, ArrayList is sufficient because the constraints on N and Q allow O(N) per operation, resulting in an overall O(Q * N) time complexity."
// Pitfalls    (1) Using ArrayList.add(index, element) or ArrayList.remove(index) results in O(N) time complexity per operation due to element shifting.  (2) Failing to account for the index shifting that occurs after every insertion or deletion operation.  (3) Assuming that the input indices for Insert or Delete operations are always within the current bounds of the list.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            String type = sc.next();
            if (type.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            } else {
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
