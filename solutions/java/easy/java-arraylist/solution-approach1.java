// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
// Problem     Java Arraylist
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:59 a.m.
// Technique   nested-arraylist-lookup
// Time        O(N + Q)
// Space       O(N)
// Insight     The solution maps 1-based input coordinates to 0-based list indices by subtracting one from both the line number and the element position.
// Interview   Before: "How would you store and query variable-length rows of integers?" After: "I used a List of Lists to store the data, allowing O(1) access per query. The total time complexity is O(N + Q), where N is the total number of integers and Q is the number of queries, while handling 1-based indexing errors."
// Pitfalls    (1) Failing to account for 1-based indexing in the problem statement, which leads to IndexOutOfBoundsException if using raw input values.  (2) Neglecting to validate both the line index and the element position, which causes runtime errors when accessing non-existent coordinates.  (3) Using standard System.out.println inside a loop instead of StringBuilder, which significantly degrades performance for large query counts.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> line = new ArrayList<Integer>();
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }

        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            List<Integer> line = lines.get(x - 1);
            if (y >= 1 && y <= line.size()) {
                sb.append(line.get(y - 1)).append("\n");
            } else {
                sb.append("ERROR!\n");
            }
        }
        sc.close();

        System.out.print(sb);
    }
}
