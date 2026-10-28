// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
// Problem     Tag Content Extractor
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:33 a.m.
// Technique   regex-backreference-pattern-matching
// Time        O(N * M) where N is the number of lines…
// Space       O(M) for the regex matcher state
// Insight     The regex pattern uses a capturing group for the tag name and a backreference to ensure the closing tag matches the opening tag exactly.
// Interview   Before: "How would you parse nested XML tags without a full parser?" After: "I used a regex with a backreference to enforce tag symmetry. This approach runs in O(M) time per line, effectively handling the requirement that start and end tags must match while ignoring invalid nested structures."
// Pitfalls    (1) The regex pattern <([^<>]+)>([^<>]+)</\1> fails to capture content if the tag contains nested tags, as the middle group excludes angle brackets.  (2) The regex does not handle cases where the tag name contains special characters that might conflict with the regex syntax.  (3) The solution assumes that the content between tags cannot contain any other tags, which is a strict interpretation of the problem's nested tag constraint.
// ──────────────────────────────────────────────────

import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Pattern p = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");

        while (testCases-- > 0) {
            String line = in.nextLine();
            Matcher m = p.matcher(line);

            boolean found = false;
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
        }
        in.close();
    }
}
