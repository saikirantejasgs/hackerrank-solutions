// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Problem     Java Stack
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:46 a.m.
// Technique   stack-based-bracket-matching
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a stack of opening brackets and verifies that every closing bracket matches the most recently pushed opening bracket, ensuring the stack is empty upon completion.
// Interview   Before: "I would use a counter to track bracket pairs." After: "A counter fails for nested types like ([)]. I use a stack to track the LIFO order, achieving O(n) time and O(n) space, which correctly handles all nested and sequential bracket combinations."
// Pitfalls    (1) Failing to check if the stack is empty before calling pop when encountering a closing bracket.  (2) Returning true if the stack is not empty after processing the entire string.  (3) Incorrectly matching closing brackets with the wrong opening bracket type.
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
