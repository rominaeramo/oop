
package concurrency;

public class SelfishRunner extends Thread {

	  private int tick = 1;
	  private int num = 0;

	  public SelfishRunner(int num) {
	    this.num = num;
	  } 

	  public void run() {
	     while (tick < 400000) {
	        tick++;
	        if ((tick % 50000) == 0) {        
	            System.out.format("Thread #%d, tick = %d%n", num, tick);
	        }
	    }
	  } 
	}

