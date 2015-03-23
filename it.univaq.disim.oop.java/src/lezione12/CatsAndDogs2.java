//: c11:CatsAndDogs2.java
// Simple container with Iterator.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package lezione12;
 
import java.util.*;

public class CatsAndDogs2 {
 
  public static void main(String[] args) {
    List cats = new ArrayList();
    
    for(int i = 0; i < 7; i++)
      cats.add(new Cat(i));
    
    Iterator e = cats.iterator();
    while(e.hasNext())
      ((Cat)e.next()).id();
    
  }
  
  
} ///:~
