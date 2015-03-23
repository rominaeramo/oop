//: lezione5:Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package lezione5;

/* 
 * Si può creare un oggeto Tree o come pianta spontanea, senza alcun parametro, o come pianta cresciuta in serra,
 * con una certa altezza. A tale scopo vi è un costruttore di default e uno che accetta come parametro l'altezza
 * esistente.
 * 
 * Si può chiamare il metodo info() in più di un modo: con un argomento String, se c'è un messaggio da stampare e senza
 * parametri in caso contrario. La ridefinizione di metodi permette di utilizzare lo stesso nome per entrambi.
 * 
 */
class Tree {
  int height;
  Tree() {
    System.out.println("Planting a seedling");
    height = 0;
  }
  
  Tree(int i) {
    System.out.println("Creating new Tree that is "
      + i + " feet tall");
    height = i;
  }
  void info() {
    System.out.println("Tree is " + height + " feet tall");
  }
  void info(String s) {
    System.out.println(s + ": Tree is "
      + height + " feet tall");
  }
}

public class Overloading {

  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
      System.out.println("height: " + t.height);
    }
    
    // Overloaded constructor:
    new Tree();
  }
} 
