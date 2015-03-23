package lezione5;

class Point2 {
	int x, y;
   public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
  public Point2(Point2 p) {
      this.x = p.x;
      this.y = p.y; 
  }

  public void move(int x, int y) {
  	   this.x = x;
	   this.y = y;
  }
  public Point2 clonePoint() {
     return new Point2(this);
  }
}

public class This2 {
	public static void main(String[] args) {
		Point2 p = new Point2(100, 100);
		Point2 p1 = p.clonePoint();
		p.move(200, 200);
		System.out.println("p.x: " + p.x);
	 	System.out.println("p.y: " + p.y);
 		System.out.println("p1.x:" + p1.x);
	 	System.out.println("p1.y:" + p1.y);

  }
}