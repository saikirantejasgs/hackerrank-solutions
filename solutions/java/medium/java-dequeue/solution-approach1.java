// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true
// Problem     Java Dequeue
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:09 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Deque<Integer> deque = new ArrayDeque<Integer>();
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);
            Integer c = counts.get(num);
            counts.put(num, c == null ? 1 : c + 1);

            if (deque.size() > m) {
                int old = deque.removeFirst();
                int oldCount = counts.get(old);
                if (oldCount == 1) {
                    counts.remove(old);
                } else {
                    counts.put(old, oldCount - 1);
                }
            }

            if (deque.size() == m && counts.size() > max) {
                max = counts.size();
            }
        }
        in.close();

        System.out.println(max);
    }
}
