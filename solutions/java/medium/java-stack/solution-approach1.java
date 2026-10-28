// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Problem     Java Stack
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:46 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(')
                        || (c == '}' && top != '{')
                        || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
}
