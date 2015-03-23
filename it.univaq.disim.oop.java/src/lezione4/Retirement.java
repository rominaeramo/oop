package lezione4;

public class Retirement {
	   public static void main(String[] args) {
		double goal = Double.parseDouble( args[0] );
		System.out.println("Obiettivo: "  + goal );
		double payment = Double.parseDouble( args[1] ); 
		System.out.println("Rata annuale: " + payment);
		double interestRate = Double.parseDouble( args[2] );
		System.out.println( "Tasso interesse percentuale: " + interestRate );
	      double balance = 0;
	      int years = 0;
	      double interest = 0;
	      while (balance < goal) {
	         balance += payment;
	         interest = balance * interestRate / 100;
	         balance += interest;
	         years++;
	      }
	      System.out.println("Puoi ritirare in " + years + " anni.");
	   }
	}
