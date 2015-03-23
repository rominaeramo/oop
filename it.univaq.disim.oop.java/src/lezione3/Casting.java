package lezione3;

class Point { 
	int x, y; 
}

class ColoredPoint extends Point {
	int color;
	public void setColor(int c) { 
		color = c;
		
	}
}

public class Casting {
	public static void main(String[] args) {
		Point p = new Point();
		Point p2 = new ColoredPoint();
		ColoredPoint cp = new ColoredPoint();
		cp = (ColoredPoint)p; 		//Errore a run-time
		cp = (ColoredPoint)p2;		//OK
		//Long l = (Long)p; 		//Errore in compilazione
		//int i = (int) p; 			//Errore in compilazione
		
		//cp.setColor(1);
		//p2.setColor(2);
		//((ColoredPoint)p2).setColor(2);
		//((ColoredPoint) p).setColor(4);
	}
}

