// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
// Problem     Java Map
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:44 a.m.
// Technique   hash-map-lookup
// Time        O(N + Q)
// Space       O(N)
// Insight     The implementation utilizes a hash map to achieve constant-time average retrieval for phone book entries, mapping unique names to their corresponding eight-digit phone numbers.
// Interview   Before: "I would use a nested loop to search the list for each query." After: "Using a HashMap reduces the lookup time to O(1) per query, resulting in O(N + Q) total time complexity, where N is the number of entries and Q is the number of queries."
// Pitfalls    (1) Failing to handle the end-of-file condition correctly when reading queries using Scanner.  (2) Ignoring potential empty lines in the input stream which may cause incorrect query processing.  (3) Assuming names are unique without considering that the problem statement implies a direct mapping.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());

        Map<String, String> phoneBook = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine().trim();
            String phone = in.nextLine().trim();
            phoneBook.put(name, phone);
        }

        while (in.hasNextLine()) {
            String query = in.nextLine().trim();
            if (query.isEmpty()) {
                continue;
            }
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
