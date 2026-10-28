// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true
// Problem     Java Method Overriding
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:27 a.m.
// Technique   method-overriding
// Time        O(1)
// Space       O(1)
// Insight     The subclass overrides the superclass method to provide a specialized implementation while maintaining the same method signature.
// Interview   Before: "How do I modify the behavior of an inherited method?" After: "By using the @Override annotation, I ensure the subclass method replaces the superclass version, executing in O(1) time while correctly accessing the subclass-specific getName method."
// Pitfalls    (1) Failing to use the @Override annotation, which prevents the compiler from verifying that the method signature matches the superclass.  (2) Changing the return type or parameter list, which results in method overloading rather than overriding.
// ──────────────────────────────────────────────────



  
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }

