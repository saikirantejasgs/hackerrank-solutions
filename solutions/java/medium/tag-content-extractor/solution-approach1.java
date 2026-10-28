// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
// Problem     Tag Content Extractor
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:33 a.m.
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
