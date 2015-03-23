package lezione6;

class Scodella {
  Scodella(int marker) {
    System.out.println("Scodella(" + marker + ")");
  }
  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class Tavolo {
  static Scodella b1 = new Scodella(1);
  static Scodella b2 = new Scodella(2);
  
  Tavolo() {
    System.out.println("Table()");
    b2.f(1);
  }
  void f2(int marker) {
    System.out.println("f2(" + marker + ")");
  }

}

class Credenza {
  Scodella b3 = new Scodella(3);
  static Scodella b4 = new Scodella(4);
  static Scodella b5 = new Scodella(5);
  
  Credenza() {
    System.out.println("Credenza()");
    b4.f(2);
  }
  void f3(int marker) {
    System.out.println("f3(" + marker + ")");
  }

}

public class StaticInitialization {

  static Tavolo t2 = new Tavolo();
  static Credenza t3 = new Credenza();
	  
  public static void main(String[] args) {
    System.out.println("Creating new Credenza() in main");
    new Credenza();
    System.out.println("Creating new Credenza() in main");
    new Credenza();
    t2.f2(1);
    t3.f3(1);
  }

} 
