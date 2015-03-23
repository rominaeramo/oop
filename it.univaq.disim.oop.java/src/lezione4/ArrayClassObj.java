package lezione4;

import java.util.*;

public class ArrayClassObj {
 
  static Random rand = new Random();
  
  public static void main(String[] args) {
	  

    Integer[] a = new Integer[rand.nextInt(20)];
  
    System.out.println("length of a = " + a.length);
    
    for(int i = 0; i < a.length; i++) {
      a[i] = new Integer(rand.nextInt(500));
      System.out.println("a[" + i + "] = " + a[i]);
    }
    
  }
  
} 
