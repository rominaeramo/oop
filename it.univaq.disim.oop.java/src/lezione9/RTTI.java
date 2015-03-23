package lezione9;



class Useful {
  public void f() {}
  public void g() {}
}

class MoreUseful extends Useful {
  public void f() {}
  public void g() {}
  public void u() {}
  public void v() {}
  public void w() {}
}

public class RTTI {
  public static void main(String[] args) {

    Useful a = new Useful();
    Useful b = new MoreUseful();
        
    a.f();
    b.g();
    // Errore a tempo di compilazione:  method not found in Useful:
    //! b.u();
    ((MoreUseful)b).u(); // Downcast/RTTI - Non si ha errore perchè di fatto b ha il metodo u()
    ((MoreUseful)a).u(); // Exception thrown, a non ha il metodo u()
  }
} 
