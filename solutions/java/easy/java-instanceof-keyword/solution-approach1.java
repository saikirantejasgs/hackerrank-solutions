// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-instanceof-keyword/problem?isFullScreen=true
// Problem     Java Instanceof keyword
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:32 a.m.
// Technique   instanceof-type-checking
// Time        O(N)
// Space       O(N)
// Insight     The implementation iterates through the ArrayList and uses the instanceof operator to classify each object into one of three distinct types, incrementing corresponding counters for each match.
// Interview   Before: "How do I count different object types in a mixed list?" After: "You can iterate through the list and use the instanceof operator to check each element's type. This approach runs in O(N) time, where N is the number of elements in the list."
// Pitfalls    (1) Using if-else if blocks instead of independent if statements would fail if an object could be an instance of multiple types, though not applicable here.  (2) Failing to handle the Object type returned by ArrayList.get() correctly when performing type checks.
// ──────────────────────────────────────────────────

import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOFTutorial{
	
   static String count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
      Object element = mylist.get(i);
      if (element instanceof Student)
       a++;
      if (element instanceof Rockstar)
    b++;
      if (element instanceof Hacker)
      c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}
