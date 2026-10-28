// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true
// Problem     Java Dequeue
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:09 a.m.
// Technique   sliding-window-deque-hashmap
// Time        O(n)
// Space       O(m)
// Insight     The algorithm maintains a sliding window of size m using a deque and a frequency map to track the count of unique elements in constant time per insertion.
// Interview   Before: "I would use a nested loop to check every subarray of size m." After: "That would be O(n*m). Instead, I use a sliding window with a HashMap and Deque to achieve O(n) time complexity, which is optimal for the given constraints."
// Pitfalls    (1) Failing to remove the element from the frequency map when its count reaches zero, which incorrectly inflates the unique count.  (2) Updating the maximum unique count before the deque reaches the required size m, leading to premature results.  (3) Using a slow data structure for frequency tracking that exceeds the 3-second time limit for large inputs.
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
