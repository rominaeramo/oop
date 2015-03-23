package lezione5;

class C {
	public C() {
		System.out.println("Sono il costruttore di default di C");	
	}
	public C(int i) {
		System.out.println("Sono il costruttore di C con parametro " + i);
	}
}

class A extends C {
	//Prova a commentare il costruttore di default
	public A() {
		System.out.println("Sono il costruttore di default di A");
	}
	public A(int i){
		System.out.println("Sono il costruttore di A(int)");
	}
}

class B extends A {
	public B() {
		//super(5);
		//this(4);
		System.out.println("Sono il costruttore di default di B");
		//this(7);
	}
	public B(int i) {
		this();
//		super();
		System.out.println("Sono il costruttore di B(int)");
	}
}

public class ConstructorOrder {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//B b = new B();
		B b = new B(5);
		// TODO Auto-generated method stub

	}

}
