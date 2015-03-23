package lezione4;

 

public class Swap3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(100,200);
		Point p2 = new Point(300,400);
		
		Integer i = new Integer(50);
		
		System.out.println("Valore di i " + i);
		
		System.out.println("p1=" + p1);
		System.out.println("p2=" + p2);
		System.out.println("p1.x " + p1.x + " p1.y " + p1.y);
		System.out.println("p2.x " + p2.x + " p2.y " + p2.y);
		swap( p1, p2 );
		System.out.println("p1=" + p1);
		System.out.println("p2=" + p2);
		System.out.println("p1.x " + p1.x + " p1.y " + p1.y);
		System.out.println("p2.x " + p2.x + " p2.y " + p2.y);

	}

	public static void swap(Point p1, Point p2) {
		int tempx = p1.x;
		int tempy = p1.y;
		p1.x = p2.x;
		p1.y = p2.y;
		p2.x = tempx;
		p2.y = tempy;
	}

}


