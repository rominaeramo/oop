package concurrency;

class Watcher extends Thread {

	  private AlwaysEven ae;
	  public Watcher(AlwaysEven ae) {
	    this.ae = ae;
	  } 

	  public void run() {
	    while(true) {
	      int val = ae.getValue();
	      if(val % 2 != 0) {
	        System.out.println(val);
	        System.exit(0);
	      }
	    }
	  }
	}

	public class AlwaysEven {
	  private int i;
	  public synchronized void next() { i++; i++; }
	  public int getValue() { return i; }

	  public static void main(String[] args) {
	    final AlwaysEven ae = new AlwaysEven();
	    Watcher w = new Watcher(ae);
	    w.start();
	    while(true) { ae.next(); }
	    
	  }
	}
