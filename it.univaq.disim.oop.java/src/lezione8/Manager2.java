package lezione8;


public class Manager2 extends Employee2 {  

	  private double bonus;
	

	  /*
	  public Manager2(String n, double s, int year, int month, int day) {  
	   
	     // super(n, s, year, month, day);
	      bonus = 0;
	  }
	  */
	
	  public double getSalary() { 
	      double baseSalary = super.getSalary();
	      return baseSalary + bonus;
	  }
	
	   public void setBonus(double b) {  
	      bonus = b;
	  }
}


class TestManager2 {
	
	  public static void main(String args){
		  Manager2 m = new Manager2();
		  //! m.setSalary(1000);	Errore perchè l'attributo salary di Employee è final
		  //! m.setSalary(2000);
		  
	  }
	
}
