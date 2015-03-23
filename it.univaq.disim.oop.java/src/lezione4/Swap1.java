package lezione4;

public class Swap1 {

	
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		swap( x, y );
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}

