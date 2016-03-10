
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		ColoredPoint cp = new ColoredPoint();
		cp = (ColoredPoint)p;
	}
}

class Point {
	int x,y;
}

class ColoredPoint extends Point{
	String color;
}
