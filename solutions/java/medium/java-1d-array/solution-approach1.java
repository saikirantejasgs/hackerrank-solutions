// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
// Problem     Java 1D Array (Part 2)
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:42 a.m.
// Technique   breadth-first-search
// Time        O(n)
// Space       O(n)
// Insight     The algorithm performs a breadth-first search to explore all reachable indices, marking visited cells to prevent cycles and redundant processing while checking for win conditions at each step.
// Interview   Before: "I could use recursion to explore paths." After: "Recursion might hit stack limits on large arrays, so I used a queue-based BFS to ensure O(n) time and space complexity while correctly handling the leap and backward movement rules."
// Pitfalls    (1) Failing to mark the starting index as visited, which allows the algorithm to re-process the origin and potentially enter an infinite loop.  (2) Neglecting to check if the destination index is within bounds before accessing the game array, which triggers an ArrayIndexOutOfBoundsException.  (3) Forgetting to check the visited array before adding a new index to the queue, leading to redundant work and potential memory exhaustion.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int i = queue.poll();

            // walking or jumping off the end wins
            if (i + 1 >= n || i + leap >= n) {
                return true;
            }

            // move backward
            if (i - 1 >= 0 && game[i - 1] == 0 && !visited[i - 1]) {
                visited[i - 1] = true;
                queue.add(i - 1);
            }
            // walk forward
            if (game[i + 1] == 0 && !visited[i + 1]) {
                visited[i + 1] = true;
                queue.add(i + 1);
            }
            // jump forward
            if (game[i + leap] == 0 && !visited[i + leap]) {
                visited[i + leap] = true;
                queue.add(i + leap);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scan.close();
    }
}
