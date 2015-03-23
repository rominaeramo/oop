
package concurrency;

public class YieldingThread extends Thread {
	  private int countDown = 5;
	  private static int threadCount = 0;
	  public YieldingThread() {
	    super("" + ++threadCount);
	    start();
	  }
	  public String toString() {
	    return "#" + getName() + ": " + countDown;
	  }
	  public void run() {
	    while(true) {
	      System.out.println(this);
	      if(--countDown == 0) return;
	      yield();
	    }
	  }
	  public static void main(String[] args) {
	    for(int i = 0; i < 5; i++)
	      new YieldingThread();
	  }
	}
/*Output:
#1: 5
#5: 5
#4: 5
#4: 4
#3: 5
#2: 5
#3: 4
#4: 3
#3: 3
#5: 4
#4: 2
#1: 4
#5: 3
#3: 2
#2: 4
#1: 3
#5: 2
#2: 3
#4: 1
#5: 1
#2: 2
#1: 2
#3: 1
#2: 1
#1: 1
*/