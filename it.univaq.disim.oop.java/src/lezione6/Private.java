package lezione6;

class A {
	private int x;
	
	public void setX(int l){
		x=l;
	}
}

public class Private {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setX(5);
		//! a.x=5;

	}

}
