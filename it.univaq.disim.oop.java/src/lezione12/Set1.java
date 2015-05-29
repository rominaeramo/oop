package lezione12;

import java.util.*;

public class Set1 {
 
  static void fill(Set s) {
    s.addAll(Arrays.asList(
      "one two three four five six seven".split(" ")));
  }
  static void fill2(Set s) {
	s.addAll(Arrays.asList(
	   "one two three four five six seven eight".split(" ")));
  }
  
  public static void test(Set s) {
    // Strip qualifiers from class name:
    System.out.println(
      s.getClass().getName().replaceAll("\\w+\\.", ""));
    
    fill(s); //fill(s); fill(s); fill2(s);
    
    System.out.println(s); // No duplicates!
    
    /* Add another set to this one:
    s.addAll(s);
    s.add("one");
    s.add("one");
    s.add("one");
    s.add("ten");
    System.out.println(s);
    // Look something up:
    System.out.println("s.contains(\"one\"): " +
      s.contains("one") );*/
    
   
  }
  public static void main(String[] args) {
    test(new HashSet());
    test(new TreeSet());
    test(new LinkedHashSet()); 
  }
}
