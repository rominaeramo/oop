package lezione8;

class Point3 {
   int x = 0, y = 0;
   void move(int dx,int dy) {
		x += dx;
		y += dy;
   }
   
   static void m2() { }
   
   public void m3() { }
   
   protected void m4() {}
   
   void m5() {}
   
}

public class SlowPoint extends Point3 {
	int xLimit, yLimit;
	void move(int dx, int dy) {
		super.move(limit(dx,xLimit),
                  limit(dy,yLimit) );
   }

	// void m2(){}		//Errore perchè Un metodo di istanza non può effettuare 
						//l’override di metodi statici	

	// private void m3() {} //m3() di Point3 e' public e deve rimanere tale
	
	// private void m4() {} //m4() può essere protected o public
	
	//!private void m5() {} //m5() di Point3 è di package e pertanto non può essere 
							//private in SlowPoint
	
	static int limit( int d, int limit) {
		return (d > limit) ? limit : ( (d < - limit) ? limit : d ); 	
	}

}
