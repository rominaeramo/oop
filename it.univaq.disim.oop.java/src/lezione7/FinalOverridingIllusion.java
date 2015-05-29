package lezione7;

class WithFinals {
  // Identical to "private" alone:
  private final void f() {
    System.out.println("WithFinals.f()");
  }
  // Also automatically "final":
  private void g() {
    System.out.println("WithFinals.g()");
  }
}

class OverridingPrivate extends WithFinals {
  //Non si stanno ridefinendo i metodi f() e g() ma 
  //se ne stanno creando dei nuovi
  private final void f() {
    System.out.println("OverridingPrivate.f()");
  }
  private void g() {
    System.out.println("OverridingPrivate.g()");
  }
}

class OverridingPrivate2 extends OverridingPrivate {

  //Non si stanno ridefinendo i metodi f() e g() ma 
  //se ne stanno creando dei nuovi	
  public final void f() {
    System.out.println("OverridingPrivate2.f()");
  }
  public void g() {
    System.out.println("OverridingPrivate2.g()");
  }
  
  public void h(){
	  System.out.println("OverridingPrivate2.h()");
  }
}

public class FinalOverridingIllusion {

  public static void main(String[] args) {
    OverridingPrivate2 op2 = new OverridingPrivate2();
    op2.f();
    op2.g();
    // You can upcast:
    OverridingPrivate op = op2;
    // But you can't call the methods:
    // op.f();
    // op.g();
    // Same here:
    WithFinals wf = op2;
    //! wf.f();
    //! wf.g();
   
  }
} 
