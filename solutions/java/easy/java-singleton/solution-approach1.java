// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
// Problem     Java Singleton Pattern
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:19 a.m.
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
