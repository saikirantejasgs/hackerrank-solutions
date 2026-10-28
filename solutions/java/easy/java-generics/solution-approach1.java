// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
// Problem     Java Generics
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:04 a.m.
// Technique   generic-type-parameter-method
// Time        O(N)
// Space       O(1)
// Insight     The method uses a type parameter T to iterate over and print elements of any object array type without requiring method overloading.
// Interview   Before: "How do I handle multiple array types without overloading?" After: "By using a generic method with a type parameter <T>, the compiler handles type erasure, allowing the method to process any object array in O(N) time with O(1) auxiliary space."
// Pitfalls    (1) Attempting to use primitive arrays like int[] instead of wrapper types like Integer[] will cause a compilation error because generics only support object types.  (2) Using method overloading to solve the problem violates the specific constraint provided in the problem statement.
// ──────────────────────────────────────────────────



class Printer
{
   public <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
 
}

