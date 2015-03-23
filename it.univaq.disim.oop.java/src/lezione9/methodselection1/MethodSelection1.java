package lezione9.methodselection1;

class A {
	  int method(A a) {
	    return 1;
	  }
	  int method(B a) {
	    return 2;
	  }  
	}

class B extends A {
  int method(A a) {
    return 3;
  } 
  int method(B a) {
    return 4;
  }
}

class C extends B {
	
	
}


public class MethodSelection1  {
	
	public static void main(String args[]){		
		A a1 = new A();
		B a2 = new B();
		A a3 = new B();
		C a4 = new C();

		System.out.println("a1.method(a1) vale " + a1.method(a1));
		System.out.println("a1.method(a2) vale " + a1.method(a2));	
		System.out.println("a1.method(a3) vale " + a1.method(a3));
		
		System.out.println("a2.method(a1) vale " + a2.method(a1));
		System.out.println("a2.method(a2) vale " + a2.method(a2));
		System.out.println("a2.method(a3) vale " + a2.method(a3));
		
		
		
		System.out.println("a3.method(a1) vale " + a3.method(a1));
		System.out.println("a3.method(a2) vale *" + a3.method(a2));
		System.out.println("a3.method(a3) vale " + a3.method(a3));
		
		
		System.out.println("a4.method(a4) vale " + a4.method(a4));
		
	}
	
	
}

