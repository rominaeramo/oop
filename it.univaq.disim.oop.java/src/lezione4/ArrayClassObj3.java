package lezione4;


class Point {
	int x;
	int y;
		
	public Point(int i, int j){
		x=i;
		y=j;
	}
	
	
	public String toString() {
		return "Stampa dell'oggetto Point con valore x="+x+"e y="+y;
	}
	
}

public class ArrayClassObj3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point[] points;
		points  = new Point[3];
		
		points[0] = new Point(4,5);
		
		System.out.println(points[0]);
		

	}

}
