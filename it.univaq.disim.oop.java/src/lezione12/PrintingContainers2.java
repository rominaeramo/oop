//: lezione12/PrintingContainers.java
// I contenitori si visualizzano o stampano automaticamente

package lezione12;

import java.util.*;

public class PrintingContainers2 {

  static Collection fill(Collection c) {
	System.out.println("Aggiunto dog ?" + c.add("dog"));
    System.out.println("Aggiunto dog ?" + c.add("dog"));
    System.out.println("Aggiunto cat ?" + c.add("cat"));
    return c;
  }
  static Map fill(Map m) {
	 System.out.println("Aggiunto dog ?" + m.put("dog", "Bosco"));
	 System.out.println("Aggiunto dog ?" + m.put("dog", "Spot"));
	 System.out.println("Aggiunto cat ?" + m.put("cat", "Rags"));
    return m;
  }
  
  public static void main(String[] args) {
    //System.out.println(fill(new ArrayList()));
    //System.out.println(fill(new HashSet()));
    System.out.println(fill(new HashMap()));
  }
} 
