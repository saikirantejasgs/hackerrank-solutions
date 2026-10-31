// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true
// Problem     Java Exception Handling (Try-catch)
// Difficulty  Easy
// Subdomain   Exception Handling
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-31, 09:53 a.m.
// Technique   try-catch-exception-handling
// Time        O(1)
// Space       O(1)
// Insight     The implementation utilizes Java's exception handling mechanism to catch and print specific error types when integer division fails due to invalid input types or division by zero.
// Interview   Before: "How do you handle runtime errors during user input processing?" After: "I use a try-catch block to intercept InputMismatchException and ArithmeticException, ensuring the program gracefully reports the error type in O(1) time, which is essential for handling invalid inputs like non-integers or zero divisors."
// Pitfalls    (1) Printing the exception object directly for ArithmeticException includes the message, whereas printing the class name for InputMismatchException matches the specific output format required.  (2) Failing to handle InputMismatchException will cause the program to terminate abruptly when non-integer inputs are provided.  (3) Assuming division by zero only throws an ArithmeticException without considering that non-integer inputs trigger an InputMismatchException first.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
