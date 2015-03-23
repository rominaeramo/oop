package lezione8.test;

class Point {
	int x, y;
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void init() {     
		System.out.println("Point.init();");
	}
	public void move(){ 
		init();
	}
}

class Point3D extends Point {
	Point3D(int x, int y) {
		super(x, y);
	}
	public void init(){ 
		//super.init(); //evito effetti collaterali
		
	} 
	
}

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point3D(10,30);
		p.move();
		//p.init(); //ERRORE
	
	}

}
