package lezione9;


import java.util.*;


/*
 * La classe Shape stabilisce l'interfaccia comune per qualsiasi classe ereditata da essa.
 */
class Shape {
  void draw() {}
  void erase() {}
}

class Circle extends Shape {
  void draw() {
    System.out.println("Circle.draw()");
  }
  void erase() {
    System.out.println("Circle.erase()");
  }
}

class Square extends Shape {
  void draw() {
    System.out.println("Square.draw()");
  }
  void erase() {
    System.out.println("Square.erase()");
  }
}

class Triangle extends Shape {
  void draw() {
    System.out.println("Triangle.draw()");
  }
  void erase() {
    System.out.println("Triangle.erase()");
  }
}

/*
 *  "Fabbrica" che produce un riferimento ad un oggetto Shape 
 *  di forma geometrica casuale ogni
 *  volta che viene invocato il suo metofo next()
 */

class RandomShapeGenerator {
  private Random rand = new Random();
  
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();			//L'upcasting avviene in queste istruzioni di return
      case 1: return new Square();			//visto che ogni volta viene restituito un riferimento
      case 2: return new Triangle();		//ad un oggetto Shape
    }
  }
}

public class Shapes {
 
  private static RandomShapeGenerator gen = new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    
    // L'array Shape viene inizializzato in maniera "randomica"
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    
    // Quando si attraverssa l'array e si chiama il metodo draw() per ciascun riferimento
    // si avrà il comportamente del tipo di oggetto specifico
    for(int i = 0; i < s.length; i++)
      s[i].draw();
    
  }
}
