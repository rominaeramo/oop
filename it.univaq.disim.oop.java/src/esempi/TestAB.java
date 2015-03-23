/**
 * 
 */
package esempi;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */

/*class A{	
	String method(A a, B b){
		return "a";
	}
}
class B extends A{	
	String method(B a, A b){
		return "b";
	}	
	String method(B a, B b){
		return "c";
	}
}*/

/*
class A{
	int method(A a){
		return 1;
	}
	int method(B a){
		return 2;
	}	
}
class B extends A{	
	int method(A a){
		return 3;
	}	
	int method(B a){
		return 4;
	}	
	String method(B a, B b){
		return "c";
	}	
}
class C extends B{
}*/


class A {
	A() {
	}
	int redirect(B b) {
		return b.method(this);
	}
	int method(A a) {
		return 0;
	}
	int method(B b) {
		return 1;
	}
}

class B extends A{
	B(){	 
	}
	
	int redirect (A a){
		return a.method(this);
	}
	
	int method(B b){
		return 2;
	}
}

public class TestAB {
	
	
	
	public static void main(String[] args){
		/*A a = new A(); 
		B b = new B();
		A c = new B();
		
		//5a.method(a, a);
		//b.method(b, b);
		//c.method(c, c);
		b.method(c, b);*/
		
		/*
		A a1 = new A();
		B a2 = new B();
		A a3 = new B();
		C a4 = new C();
		
		System.out.println(a3.method(a3));
		*/
		
		A a = new A();
		B b = new B();
		A c = b;
		
		//System.out.println(a.redirect(a));
		System.out.println(b.redirect(c));
		System.out.println(c.redirect(b));
		//System.out.println(c.redirect(c));
		}
}







