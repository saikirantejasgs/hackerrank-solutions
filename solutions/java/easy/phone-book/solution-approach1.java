// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
// Problem     Java Map
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 12:44 a.m.
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
