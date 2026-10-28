// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true
// Problem     Java Inheritance II
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:24 a.m.
// Technique   class-inheritance-extension
// Time        O(1)
// Space       O(1)
// Insight     The Adder class inherits the add method from the Arithmetic superclass, allowing it to perform integer addition without explicit redefinition.
// Interview   Before: "How do I implement inheritance in Java?" After: "By using the extends keyword, the subclass inherits all non-private members of the superclass. This implementation runs in O(1) time and O(1) space, effectively reusing the Arithmetic logic."
// Pitfalls    (1) Declaring the classes as public, which violates the specific constraint that classes should not be public.  (2) Redefining the add method unnecessarily, which is not required since inheritance provides the functionality automatically.
// ──────────────────────────────────────────────────



class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

