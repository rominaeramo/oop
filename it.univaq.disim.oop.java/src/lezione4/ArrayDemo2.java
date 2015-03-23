package lezione4;

import java.util.*;

public class ArrayDemo2 {
	
  static Random rand = new Random();	
  public static void main(String[] args) {
    int[] a;
    a = new int[rand.nextInt(20)];						//Random.nextInt() fornisce un valore casuale tra 0 ed il valore del suo argomento
    System.out.println("length of a = " + a.length);
    for(int i = 0; i < a.length; i++)
      System.out.println("a[" + i + "] = " + a[i]);		//Gli array sono automaticamente inizializzati con valori "standard"  (vedi ArrayClassObj2.java)
    
  }
}  
