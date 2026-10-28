// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 11:01 p.m.
// ──────────────────────────────────────────────────


static Scanner sc = new Scanner(System.in);
static boolean flag = false;
static int B = sc.nextInt();
static int H = sc.nextInt();

static {
    try {
        if (B <= 0 || H <= 0) {
            throw new Exception("Breadth and height must be positive");
        }
        flag = true;
    } catch (Exception e) {
        System.out.println(e);
    }
}
