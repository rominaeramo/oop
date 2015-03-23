package lezione5;

class A4 {
	static int l;
	int x;

	static void printStatic() {
		System.out.println("Sono printStatic di A4");
		
	}
	
	void print(){
		System.out.println("Sono print di A4");
		this.printStatic();
	}
	
}

public class Static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4.l++;
		A4.printStatic();
		A4 a1 = new A4();
		a1.l++;
		a1.x++;
		//A4.x++;
		A4 a2 = new A4();
		System.out.println("a2.l: "+ a2.l + " a2.x: " + a2.x);
		
	}

}
