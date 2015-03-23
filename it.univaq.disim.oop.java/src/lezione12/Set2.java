package lezione12;

 
import java.util.*;

public class Set2 {
 
  public static Set fill(Set a, int size) {
    for(int i = 0; i < size; i++)
      a.add(new MyType(i));

    a.add(new Name("Pippo","Pluto"));
    return a;
  }
  public static void test(Set a) {
    fill(a, 10);
   // fill(a, 10); // Try to add duplicates
   // fill(a, 10);
    //a.addAll(fill(new TreeSet(), 10));
    System.out.println(a);
  }
  public static void main(String[] args) {
   test(new HashSet());
    //test(new TreeSet());
   // test(new LinkedHashSet());
    
  }
} ///:~
