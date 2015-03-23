package lezione8;

public class ManagerTest {  
	   public static void main(String[] args) {  
	      // construct a Manager object
	      Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
	      boss.setBonus(5000);
	      boss.raiseSalary(10);
	      
	      //Employee boss2 = new Manager("Carl Cracker", 80000, 1987, 12, 15);
	      //boss2.setBonus(10);
	      
	      Employee[] staff = new Employee[3];

	      // fill the staff array with Manager and Employee objects
	      staff[0] = boss;
	      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
	      staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

	      
	      // print out information about all Employee objects
	      for (int i = 0; i < staff.length; i++) {
			System.out.println("name " + staff[i].getName() + ", salary=" + staff[i].getSalary());
	      }
	      
	     //Manager m = staff[1]; //ERROR
	     //staff[0].setBonus(3000); //ERROR
	      
	     /*Manager m = (Manager) staff[1]; 
	     m.setBonus(10); //ERROR at run time
	     */
	      
	   }
}

