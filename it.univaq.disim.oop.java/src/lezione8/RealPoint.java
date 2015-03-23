package lezione8;

class Point2 {
	  int x = 0, y = 0, color;
	  void move(int dx,int dy) {
			x += dx;
			y += dy;
	  }
	  int getX() { return x; }
	  int getY() { return y; }
}

public class RealPoint extends Point2 {
	  float x = 1.0f, y = 0.0f;
	  void move(int dx, int dy) { 
			move( (float)dx, (float)dy );
	  }
	  void move(float dx, float dy) { 
			x += dx; y+=dy;
	  }
	  
	  int getSuperX(){
		  return super.x;
		  
	  }
	  
	  float getMyX() {
		  return x;
	  }
	  //int getX() { return x; }		Errore sul tipo di ritorno
	  //int getY() { return y; }		Errore sul tipo di ritorno
	  
	// float getMyX() { return x; }    //ERRORE
	// float getY() { return y; }      //ERRORE

}


