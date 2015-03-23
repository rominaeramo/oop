package lezione9.methodselection3;

class A {
	  int method(A a) {
	    return 1;
	  }
	  int method(B a) {
	    return 2;
	  }
	}
class B extends A {
	int method(B a) {
	    return 4;
	  }
	}

	
public class MethodSelection3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1 = new A();
		B a2 = new B();
		A a3 = new B();

		System.out.println("a1.method(a1) vale " + a1.method(a1));
		System.out.println("a1.method(a2) vale " + a1.method(a2));
		System.out.println("a1.method(a3) vale " + a1.method(a3));
		
		System.out.println("a2.method(a1) vale " + a2.method(a1));
		System.out.println("a2.method(a2) vale " + a2.method(a2));
		System.out.println("a2.method(a3) vale " + a2.method(a3));
		
		System.out.println("a3.method(a1) vale " + a3.method(a1));
		System.out.println("a3.method(a2) vale " + a3.method(a2));
		System.out.println("a3.method(a3) vale " + a3.method(a3));

	}

}
