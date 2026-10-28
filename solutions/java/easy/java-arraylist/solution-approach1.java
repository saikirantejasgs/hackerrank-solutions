// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
// Problem     Java Arraylist
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:59 a.m.
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
