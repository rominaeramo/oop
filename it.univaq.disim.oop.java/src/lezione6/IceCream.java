package lezione6;

class Sundae {
	  private Sundae() {}
	  private int j;
	  static Sundae makeASundae() {
		return new Sundae();
	  }
	  public void setJ(int i){
		  System.out.println("setJ("+i+")");
		  this.j=i;
	  }
	}

public class IceCream {
	  public static void main(String[] args) {
	    //Sundae x = new Sundae();
	    Sundae x = Sundae.makeASundae();
	    x.setJ(5);
	    //x.j=5; //illegal
  }
} 
	
	

