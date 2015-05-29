package lezione10;

import java.util.*;

interface AgendaUser {
	void update(Appointment a);
}
 
class Appointment {
	Date date;
	String info;
}

class Agenda {
	static AgendaUser[] users = new AgendaUser[10];
	 
	void addUser(AgendaUser u) {
		for(int i=0; i< users.length; i++) {
			if (users[i]==null){
				users[i]=u;
				break;
			}
	    }
	}
	  
	void addAppointment(Appointment a) {
		for(int i=0; i< users.length; i++) {
			if (users[i]!= null)
				users[i].update(a);
			else
				break;
	    }
	}
}

class A implements AgendaUser {
	A(Agenda a) {
		a.addUser(this);
	}
	public void update (Appointment a) {
		System.out.println("User A update..." + a.info);
	}
	//...
}

public class CallBacks {
	
	public static void main(String[] args){
		Agenda agenda = new Agenda();
		A a1 = new A(agenda);
		A a2 = new A(agenda);
		A a3 = new A(agenda);
		A a4 = new A(agenda);
		A a5 = new A(agenda);
		
		Appointment app1 = new Appointment();
		app1.info = "Appuntamento 1";
		
		Appointment app2 = new Appointment();
		app2.info = "Appuntamento 2";
		
		agenda.addAppointment(app1);
		agenda.addAppointment(app2);		
	}
	
}


