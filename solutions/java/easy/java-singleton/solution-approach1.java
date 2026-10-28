// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
// Problem     Java Singleton Pattern
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:19 a.m.
// Technique   eager-initialization-singleton
// Time        O(1)
// Space       O(1)
// Insight     The class uses eager initialization to ensure the static instance is created at class loading time, guaranteeing thread safety and a single instance without requiring explicit synchronization.
// Interview   Before: "How would you implement a thread-safe singleton?" After: "I would use eager initialization with a private constructor and a static final instance, which provides O(1) access time and ensures thread safety by leveraging the JVM class loader mechanism."
// Pitfalls    (1) Failing to make the constructor private allows external classes to instantiate the Singleton, violating the pattern's core constraint.  (2) Omitting the static keyword on the instance variable or the getter method prevents global access to the single instance.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton {

    private static final Singleton instance = new Singleton();
    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}
