package lezione12;

import java.util.*;

class Appointment {
	  //Date date;
	  String info;
	}


interface AgendaUser {
	  void update (Appointment a);
}


class Agenda {
	  //AgendaUser[] users = new User[10];
	  //List  users = new ArrayList();
	  List<AgendaUser> users = new ArrayList<AgendaUser>();
 	  
	  void addUser(AgendaUser u) {
		  users.add(u);
	  }
	  
	  void addAppointment(Appointment a) {
	    //...
	  //  for(int i=0; i< users.length; i++) {
	  //    if (users[i]!=null)
	  //  	  users[i].update(a);
	  //    else
	   // 	  break;
	   // }
	  }
	  
	  public static void main(String args[]){
		  Agenda a = new Agenda();
		  
		  User u1 = new User(a);
		  u1.setName("User1");
		  
		  User u2 = new User(a);
		  u2.setName("User2");
		  
		  User u3 = new User(a);
		  u3.setName("User2");
		  
		  
		  Appointment ap = new Appointment();
		  ap.info = "Appuntamento1";
		  a.addAppointment(ap);
		  
		  Appointment ap2 = new Appointment();
		  ap2.info = "Appuntamento2";
		  a.addAppointment(ap2);
		  
		  
	  }
}

class User implements AgendaUser {
	
	private String name;
	
	User(Agenda a){
		a.addUser(this);
	}
	public void update(Appointment a){
		System.out.println("Messaggio a " + name + ": Nuovo elemento in agenda");
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}


