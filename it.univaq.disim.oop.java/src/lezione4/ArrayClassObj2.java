package lezione4;

import java.util.*;

public class ArrayClassObj2 {
 
  static Random rand = new Random();
  
  public static void main(String[] args) {
    Integer[] a = new Integer[rand.nextInt(20)];
  
    System.out.println("length of a = " + a.length);
    
    for(int i = 0; i < a.length-1; i++) {
      a[i] = new Integer(rand.nextInt(500));
      System.out.println("a[" + i + "] = " + a[i]);
    }
    
    System.out.println("a[" + (a.length-1) + "] = " + a[a.length-1]);
  }
  
} 