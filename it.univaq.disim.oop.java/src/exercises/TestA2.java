package exercises;


public class TestA2 {

	public TestA2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 a1 = new A2 ();
		B2  a2 = new B2 ();
		A2  a3 = new B2 ();
		
		System.out.println("a1.method(a1)? " + a1.method(a1));
		
		System.out.println("a1.method(a2)? " + a1.method(a2));
		
		System.out.println("a1.method(a3)? " + a1.method(a3));
		
		System.out.println("a2.method(a1)? " + a2.method(a1));
		
		System.out.println("a2.method(a2)? " +  a2.method(a2));

		System.out.println("a2.method(a3) " +  a2.method(a3));
		
		System.out.println("a3.method(a1) " +  a3.method(a1));
		
		System.out.println("a3.method(a2) " +  a3.method(a2));
		
		System.out.println("a3.method(a3) " +  a3.method(a3));
										
						
	}

}
