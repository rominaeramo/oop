package lezione5;

class A2 {
	
	public A2() {
		System.out.println("Sono il costruttore di default A2");
	}
	
	public A2(int i) {
		System.out.println("Sono il costruttore di A2(int)");
	}
}

class B2 extends A2 {
	
	public B2() {
		System.out.println("Sono il costruttore di B2");
	}
	
	public B2(int i) {
		//super();
		//super(i);
		this('c');
		System.out.println("Sono il costruttore di B2(int)");
	}
	
	public B2(char i) {
		//super();
		this();
		System.out.println("Sono il costruttore di B2(char)");
	}
}

public class ConstructorOrder2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B2 b = new B2(5);
		// TODO Auto-generated method stub

	}

}
