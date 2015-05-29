package lezione6;


class Cup {
  Cup(int marker) {
    System.out.println("Cup(" + marker + ")");
  }
  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class Cups {
  static Cup c1;
  static Cup c2;
  static {
    c1 = new Cup(1);
    c2 = new Cup(2);
  }
  Cups() {
    System.out.println("Cups()");
  }
}

/* 
 * Gli inizializzatori static per Cups entrano in funzione o 
 * quando l'accesso dell'oggetto static c1 avviene 
 * per (1), o quando (1) é commentata e (2) invece no
 * Se entrambe (1) e (2) vengono commentate, l'inizializzazione 
 * static per Cups non si verifica mai
 * Se una o entrambe (2) non sono commentate, l'inizializzazione 
 * static avviene solo una volta
 */
public class ExplicitStatic {
 
  public static void main(String[] args) {
    System.out.println("Inside main()");
    Cups.c1.f(99);  // (1)
  //  Cups.c1.f(98);  // (1)
    
   
  }
  // static Cups x = new Cups();  // (2)
  // static Cups y = new Cups();  // (2)
} 
