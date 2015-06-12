package exercises;


public class TestA1 {

	public TestA1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 t0 = new A1();
		B1 t1 = t0.push(4);
		B1 t2 = t1.push(3);
		B1 t3 = t2.push(2);
		B1 t4 = t3.push(1);
		t4.incr(2);
		t3.swap(t4);
		t4.incr(2);
		
		System.out.println("t1.val? " + t1.val);
		System.out.println("t2.val? " + t2.val);
		System.out.println("t3.val? " + t3.val);
		System.out.println("t4.val? " + t4.val);

	}

}
