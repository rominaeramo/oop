package lezione5;

class Point4 {
	
   int x, y;
   public static int j=15;
   public Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
  public Point4(Point4 p) {
      this.x = p.x;
      this.y = p.y; 
  }

  public void move(int x, int y) {
  	   this.x = x;
	   this.y = y;
  }
  public Point4 clonePoint4() {
	 Point4.myStaticMethod();
     return new Point4(this);
  }
  
  public String toString(){
	  return "Point4: x=" + x + " y=" +y;
  }
  
  public static void myStaticMethod(){
	  System.out.println("Invocato myStaticMethod() id Point4");
	  //this.move(6,7);		Non posso farlo
  }
  
  
}


public class ClonedPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Point4 p1 = new Point4(5,6);
		Point4 p2 = p1.clonePoint4();
		
		System.out.println(p1);

		p2.move(10,18);
		System.out.println(p2);
		*/
		Point4.myStaticMethod();
		Point4.j=27;
		
	}

}
