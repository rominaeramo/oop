//: c06:FinalData.java
// The effect of final on fields.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

package lezione7;

import java.util.*;

class Value {
  int i; // Package access
  public Value(int i) { 
	  this.i = i; 
  }
}

public class FinalData {

  private static Random rand = new Random();
  private String id;
  
  public FinalData(String id) { 
	  this.id = id; 
  }
  
  // Can be compile-time constants:
  private final int VAL_ONE = 9;
  private static final int VAL_TWO = 99;
  
  // Typical public constant:
  public static final int VAL_THREE = 39; // utilizzata fuori dal pacchetto, ne esiste una sola, si tratta di una costante
  
  // Cannot be compile-time constants: 
  //il fatto che siano final non implica che il suo valore sia noto in copilazione
  //altra differenza è tra dati final static e final non static: il compilatore considera allo stesso modo i valori in 
  //fase di compilazione, ma la differenza si evidenzia quando i valori sono inizializzati in esecuzione
  private final int i4 = rand.nextInt(20);
  static final int i5 = rand.nextInt(20);
  
  private Value v1 = new Value(11);
  private final Value v2 = new Value(22);
  private static final Value v3 = new Value(33);
  
  // Arrays:
  private final int[] a = { 1, 2, 3, 4, 5, 6 };
  
  public String toString() {
    return id + ": " + "i4 = " + i4 + ", i5 = " + i5;
  }
  
  
  public static void main(String[] args) {
    FinalData fd1 = new FinalData("fd1");
    //! fd1.VAL_ONE++; // Error: can't change value
    fd1.v2.i++; // Object isn't constant!
    fd1.v1 = new Value(9); // OK -- not final
    for(int i = 0; i < fd1.a.length; i++)
      fd1.a[i]++; // Object isn't constant!
      //v2 è un riferimento final: non significa che non è possibile alterare il valore, 
      //ma che non è permesso collegare nuovamente v2 ad un nuovo oggetto
    //! fd1.v2 = new Value(0); // Error: Can't 
    //! fd1.v3 = new Value(1); // change reference
    //! fd1.a = new int[3]; //non posso rendere final i riferimenti presenti negli array
    System.out.println(fd1);
    System.out.println("Creating new FinalData");
    FinalData fd2 = new FinalData("fd2");
    System.out.println(fd1);
    System.out.println(fd2);
  }
} 
