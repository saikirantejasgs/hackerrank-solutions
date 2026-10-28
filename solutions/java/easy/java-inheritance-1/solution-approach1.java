// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
// Problem     Java Inheritance I
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:21 a.m.
// Technique   class-inheritance-extension
// Time        O(1)
// Space       O(1)
// Insight     The Bird class inherits the walk method from the Animal superclass while defining its own fly and sing methods to extend functionality.
// Interview   Before: "How do you add functionality to an existing class without modifying it?" After: "By using the extends keyword, the subclass inherits all methods from the superclass, allowing O(1) access to both inherited and newly defined methods."
// Pitfalls    (1) Failing to include the sing method within the Bird class scope.  (2) Incorrectly assuming the Bird class can access private members of the Animal class.
// ──────────────────────────────────────────────────



class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
    void sing() {
    System.out.println("I am singing");
}
}

