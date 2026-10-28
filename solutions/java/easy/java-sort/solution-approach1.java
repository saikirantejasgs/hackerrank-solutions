// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true
// Problem     Java Sort
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:06 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getFname() { return fname; }
    public double getCgpa() { return cgpa; }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (n-- > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            studentList.add(new Student(id, fname, cgpa));
            if (in.hasNextLine()) {
                in.nextLine();
            }
        }
        in.close();

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getCgpa() != b.getCgpa()) {
                    return Double.compare(b.getCgpa(), a.getCgpa());
                }
                if (!a.getFname().equals(b.getFname())) {
                    return a.getFname().compareTo(b.getFname());
                }
                return Integer.compare(a.getId(), b.getId());
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
