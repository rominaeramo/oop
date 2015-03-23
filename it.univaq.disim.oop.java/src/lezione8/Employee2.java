package lezione8;


import java.util.*;

public class Employee2 {
	   private String name;
	   private final double salary;
	   private Date hireDay;

	   public Employee2(){
		   salary=1000;
		   
	   }
	   
	   public Employee2(String n, double s, int year, 
	                   int month, int day) {  
	      name = n;
	      salary = s;
	      GregorianCalendar calendar = 
	                        new GregorianCalendar(year, month - 1, day);
	      hireDay = calendar.getTime();
	   }

	   public String getName() {
	      return name;
	   }

	   public double getSalary() {  
		      return salary;
	   }


	   
	   public Date getHireDay() {  
	      return hireDay;
	   }
	   
	   public void setName(String name){
		   this.name = name;
	   }
	   
	   /*public void setSalary(double salary) {  
		   this.salary = salary;
	   }*/
	   
	   public void setHireDay(Date hireDay){
		   this.hireDay = hireDay;
	   }

	   public void raiseSalary(double byPercent) {  
	      double raise = salary * byPercent / 100;
	      //! salary += raise; Errore perchè l'attributo salary di Employee è final
	   }

}


