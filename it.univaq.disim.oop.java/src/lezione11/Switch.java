package lezione11;


public class Switch {
  private boolean state = false;
  public boolean read() { return state; }
  public void on() { 
	  state = true; 
	  System.out.println("Switch.on() executed");
  }
  
  public void off() { 
	  state = false; 
	  System.out.println("Switch.off() executed");  
  }
} ///:~