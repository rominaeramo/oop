package lezione5;

class Point {
	   int x = 100;
	   int y = 50;
	   {
		 System.out.println("Sono all'inizio dell'inizializzatore di istanza di Point x:"+x+" y:"+y);
	     x = 200;
	     y = 250;
	     System.out.println("Sono alla fine dell'inizializzatore di istanza di Point x:"+x+" y:"+y);
	   }
	   Point() {
		 System.out.println("Sono all'inizio di Point(), x:"+x+" y:"+y);
	     x = 300;
	     y = 400;
	     System.out.println("Sono alla fine di Point(), x:"+x+" y:"+y);
	   }
	   Point(int dx, int dy) {
	     this();
	     x = dx;
	     y = dy;
	   }
	}

class ColoredPoint extends Point {
	   int color = 0xFF00FF;
	   
	/*   ColoredPoint() {
		super(10,11);   
	   }
	*/   
	
	   
}

	

public class ConstructorPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColoredPoint cp = new ColoredPoint();
        System.out.println(cp.color+" "+cp.x+" "+cp.y);
	}

}
