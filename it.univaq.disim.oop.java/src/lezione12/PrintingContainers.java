//: lezione12/PrintingContainers.java
// I contenitori si visualizzano o stampano automaticamente

package lezione12;

import java.util.*;

public class PrintingContainers {

  static Collection fill(Collection<String> c) {
	System.out.println("Aggiunto dog ?" + c.add("dog"));
    System.out.println("Aggiunto dog ?" + c.add("dog"));
    System.out.println("Aggiunto cat ?" +c.add("cat"));
    return c;
  }
  static Map fill(Map<String, String> m) {
    m.put("dog", "Bosco");
    m.put("dog", "Spot");
    m.put("cat", "Rags");
    return m;
  }
  
  public static void main(String[] args) {
    System.out.println(fill(new ArrayList<String>()));
    System.out.println(fill(new HashSet<String>()));
    System.out.println(fill(new HashMap<String, String>()));
  }
} 
