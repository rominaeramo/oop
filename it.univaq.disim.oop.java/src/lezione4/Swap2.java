package lezione4;


/* Defined in ArrayClassObj3.java
class Point {
	int x;
	int y;
		
	public Point(int i, int j){
		x=i;
		y=j;
	}
}
*/

public class Swap2 {

	public static void swap(Point p1, Point p2) {
		Point temp = p1;
		p1 = p2;
		p2 = temp;
		
		System.out.println("p1.x " + p1.x);
		System.out.println("p2.x " + p2.x);
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(100,200);
		Point p2 = new Point(300,400);
		//System.out.println("p1=" + p1.toString());
		System.out.println("p1=" + p1);		
		System.out.println("p2=" + p2);
		swap( p1, p2 );
		System.out.println("p1=" + p1);
		System.out.println("p2=" + p2);

	}

}


