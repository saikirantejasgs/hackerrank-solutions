// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
// Problem     Java Date and Time
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 11:18 p.m.
// ──────────────────────────────────────────────────



class Result {

public static String findDay(int month, int day, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day);
    return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
}
}

