package lezione5;
/*
 * I metodi print() hanno argomenti identici, ma l'ordine � diverso e questo � cio ci� che li distingue
 */
public class OverloadingOrder {

  static void print(String s, int i) {
    System.out.println("String: " + s + ", int: " + i);
  }
  static void print(int i, String s) {
    System.out.println("int: " + i + ", String: " + s);
  }
  
  public static void main(String[] args) {
    print("String first", 11);
    print(99, "Int first");
  }
} 
