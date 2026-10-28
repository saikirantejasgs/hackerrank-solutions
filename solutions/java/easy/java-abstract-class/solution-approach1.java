// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
// Problem     Java Abstract Class
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:24 a.m.
// Technique   concrete-class-inheritance
// Time        O(1)
// Space       O(1)
// Insight     The subclass provides a concrete implementation for the abstract setTitle method defined in the parent Book class to satisfy the inheritance contract.
// Interview   Before: "How do I instantiate an abstract class?" After: "You cannot instantiate an abstract class directly; you must define a concrete subclass that implements all abstract methods. This implementation runs in O(1) time and O(1) space, ensuring the abstract contract is fulfilled for the title assignment."
// Pitfalls    (1) Failing to implement the abstract setTitle method results in a compilation error because the subclass remains abstract.  (2) Declaring the MyBook class as public violates the problem constraint requiring a non-public class definition.
// ──────────────────────────────────────────────────



class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }
}

