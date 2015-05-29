package lezione9.methodselection4;

class A {
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


public class MethodSelection4 {
	public static void main(String[] args) {
		A a1 = new A();
		B a2 = new B();
		A a3 = new B();

		//System.out.println("a1.method(a1) vale " + a1.method(a1)); //NoSuchMethod 
		System.out.println("a1.method(a2) vale " + a1.method(a2));
		//System.out.println("a1.method(a3) vale " + a1.method(a3)); //NoSuchMethod 
		System.out.println("a2.method(a1) vale " + a2.method(a1));
		System.out.println("a2.method(a2) vale " + a2.method(a2));
		System.out.println("a2.method(a3) vale " + a2.method(a3));
		//!System.out.println("a3.method(a1) vale " + a3.method(a1)); NoSuchMethod 
		System.out.println("a3.method(a2) vale " + a3.method(a2));
		//System.out.println("a3.method(a3) vale " + a3.method(a3)); //NoSuchMethod 


	}

}
