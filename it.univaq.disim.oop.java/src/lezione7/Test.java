package lezione7;

class Test {

	   public static void main(String[] args) {
	      Point p1 = new Point(100,100);
	      Point p2 = new Point(200,200,p1);

	      //p1.root = new Point(300,300); //ERRORE
	      p2.root.x = 300;              //OK
	      System.out.println("ORIGIN.x:" + Point.ORIGIN.x);

	      //Point.ORIGIN = new Point(1000, 1000); //ERRORE
	      Point.ORIGIN.x = 400;                 //OK
	      System.out.println("ORIGIN.x:" + Point.ORIGIN.x);
	      System.out.println("p1.ORIGIN.x:" + p1.ORIGIN.x + " p2.ORIGIN.x:" + p2.ORIGIN.x);
	      
	   }
	}

