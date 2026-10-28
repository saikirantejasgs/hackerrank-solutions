// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
// Problem     Java Generics
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:04 a.m.
// ──────────────────────────────────────────────────



class Printer
{
   public <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
 
}

