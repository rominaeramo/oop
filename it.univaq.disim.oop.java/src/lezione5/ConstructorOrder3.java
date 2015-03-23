package lezione5;

class A3 {
	
	public A3(int i) {
		System.out.println("Sono il costruttore di A3 invocato con il valore " + i);
	}
}

class B3 extends A3 {
	int k;	//prova a spostare questa definizione dopo l'inizializzatore d'istanza
	
	{
		
		System.out.println("Sono l'inizializzatore di istanza di B3");
		k++;
	}

	
	public B3() {
		super(6);
		System.out.println("Sono il costruttore di B3");
	}
	
	public B3(int i) {
		this();
		System.out.println("i ..." + k);
		System.out.println("Sono il costruttore di B3(int)");
	}
}

public class ConstructorOrder3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B3 b = new B3(5);
		// TODO Auto-generated method stub

	}

}