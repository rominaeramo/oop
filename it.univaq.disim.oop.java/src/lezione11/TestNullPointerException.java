package lezione11;

import java.io.IOException;

class Point {
    int x,y;
    public Point(int x, int y) {
          this.x = x;
          this.y = y;
    }

}

class TestNullPointerException {

    public static void main(String[] args) {
          Point p = null;
          
        // System.out.println("Accesso variabile d’istanza x di p: " + p.x);
        
          
        try {
        	  System.out.println("Accesso variabile d’istanza x di p: " + p.x);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Sono in catch");
		}
        
          
   }

}
