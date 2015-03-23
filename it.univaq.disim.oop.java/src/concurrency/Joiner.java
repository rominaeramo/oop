package concurrency;

class Joiner extends Thread {

	  private Sleeper sleeper;

	  public Joiner(String name, Sleeper sleeper) {
	    super(name);
	    this.sleeper = sleeper;
	    start();
	  }

	  public void run() {
	   try {
	      sleeper.join();
	    } catch (InterruptedException e) {
	      throw new RuntimeException(e);
	    }
	    System.out.println(getName() + " join completed");
	  }
	}
