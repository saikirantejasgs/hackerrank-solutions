// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
// Problem     Java Currency Formatter
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 11:24 p.m.
// Technique   locale-based-number-formatting
// Time        O(1)
// Space       O(1)
// Insight     The solution utilizes the Java NumberFormat class with specific Locale instances to apply region-appropriate currency symbols and formatting rules to a double-precision input.
// Interview   Before: "How would you format a currency value for different countries?" After: "I use NumberFormat.getCurrencyInstance with specific Locales. For India, I construct a custom Locale using 'en' and 'IN'. This approach runs in O(1) time and space, effectively handling the locale-specific formatting requirements defined in the problem."
// Pitfalls    (1) Failing to construct the Indian Locale correctly using the 'en' language code as explicitly required by the problem statement.  (2) Assuming all locales are available as static constants, ignoring the need to instantiate custom Locales for regions like India.
// ──────────────────────────────────────────────────

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
      
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
