// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/duplicate-word/problem?isFullScreen=true
// Problem     Java Regex 2 - Duplicate Words
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:25 a.m.
// Technique   regex-backreference-replacement
// Time        O(N * M) where N is the number of sente…
// Space       O(M) for storing the regex match and mo…
// Insight     The regex uses a capturing group and a backreference to identify repeated word sequences, while the case-insensitive flag ensures that variations in capitalization are treated as identical tokens.
// Interview   Before: "How do I remove duplicate words while keeping the first occurrence?" After: "Use a regex with a backreference to find repeated words, then replace the entire match with the first captured group. This approach runs in O(N * M) time, effectively handling case-insensitive duplicates as required by the problem constraints."
// Pitfalls    (1) Failing to use the \b word boundary anchor, which causes the regex to match substrings within larger words.  (2) Forgetting the Pattern.CASE_INSENSITIVE flag, which prevents the regex from identifying words with different casing as duplicates.  (3) Using replaceAll incorrectly by not capturing the first word instance to preserve the original casing of the first occurrence.
// ──────────────────────────────────────────────────

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex =  "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
