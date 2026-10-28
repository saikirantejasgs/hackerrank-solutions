// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true
// Problem     Java Priority Queue
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:13 a.m.
// ──────────────────────────────────────────────────


import java.util.PriorityQueue;
import java.util.Comparator;
class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<Student>(11, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getCGPA() != b.getCGPA()) {
                    return Double.compare(b.getCGPA(), a.getCGPA());   // higher CGPA first
                }
                if (!a.getName().equals(b.getName())) {
                    return a.getName().compareTo(b.getName());         // then name A to Z
                }
                return Integer.compare(a.getID(), b.getID());          // then id ascending
            }
        });

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll();
            }
        }

        List<Student> result = new ArrayList<Student>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}

