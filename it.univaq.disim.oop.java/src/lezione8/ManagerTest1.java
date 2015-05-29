package lezione8;

public class ManagerTest1 {  
	   public static void main(String[] args) {  
		  Employee employee;
		   
		  if( (args.length==1) && (args[0].equals("Employee"))) {
		  	employee = new Employee("Harry Hacker",50000, 1989, 10, 1);
		  } else {
		  	employee = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		  }

	      //employee.setBonus(5000); //ERRORE
	    
		  if (employee instanceof Manager)
			  ((Manager)employee).setBonus(10000);
		  
	      
		  System.out.println("name=" + employee.getName() + 
	                        ",salary=" + employee.getSalary());

	   }
	}

