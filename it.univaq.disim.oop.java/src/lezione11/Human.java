package lezione11;


class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {
 
  public static void main(String[] args) {
    try {
      throw new Sneeze();
    } catch(Sneeze s) {
      System.err.println("Caught Sneeze");
    } catch(Annoyance a) {
      System.err.println("Caught Annoyance");
    } 
 
  }
} 
