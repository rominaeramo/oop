package lezione9;


class A {
	
	void f(){};
	
	void f(int x, int y){};
	void f(int y, double x){};
	void f(double y, int x){};
}

class B extends A {
	
	void f(){
		super.f();
		System.out.println("Sono f() di B");;
	}
}

public class SampleOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
