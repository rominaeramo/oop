package lezione8;

import java.util.*;

abstract class Person {  
	   private String name;

	   public Person(String n) {  
	      name = n;
	   }

	   public abstract String getDescription();

	   public String getName() {  
	      return name;
	   }
	   
	   public String myMethod(){
		   return "myMethod() di Person";
	   };
	   
	}

class Employee3 extends Person {  
	   private double salary;
	   private Date hireDay;
	   public Employee3(String n, double s, int year, int month, int day) {  
	      super(n);
	      salary = s;
	      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
	      hireDay = calendar.getTime();
	   }
	   public double getSalary() {  
	      return salary;
	   }
	   public Date getHireDay() {  
	      return hireDay;
	   }

	   public String getDescription() {  
	      return "an employee with a salary of " + salary;
	   }

	   public void raiseSalary(double byPercent) {  
	      double raise = salary * byPercent / 100;
	      salary += raise;
	   }
	   
	   public String myMethod() {
		   return "myMethod in Employee3";
	   }

	}

class Student extends Person {  
	   private String major;

	   public Student(String n, String m) {  
	      super(n);
	      major = m;
	   }
	   public String getDescription() {  
	      return "a student majoring in " + major;
	   }
	   public String myMethod() {
		   return "myMethod in Student";
	   }
	}

public class PersonTest {  
   public static void main(String[] args) {  
	  
	  //Person p = new Student("n", "m");
	  
      Person[] people = new Person[2];
      
      Employee3 employee = new Employee3("Harry Hacker", 50000, 1989, 10, 1);
      people[0] = employee; 
      people[1] = new Student("Maria Morris", "computer science");

      for (int i=0; i<people.length; i++){
   	  if (people[i] instanceof Employee3) {
    		  System.out.println(((Employee3)people[i]).myMethod() + ", " + people[i].getDescription());     	  
    	  } else {
    		  System.out.println(((Student)people[i]).myMethod() + ", " + people[i].getDescription());     	  
    	  }
 
    	 // System.out.println(people[i].myMethod() + ", " + people[i].getDescription());    	  
    	 // System.out.println(people[i].getName() + ", " + people[i].getDescription());
        //  System.out.println(people[i].myMethod() + ", " + people[i].myMethod());
      }

   }
}