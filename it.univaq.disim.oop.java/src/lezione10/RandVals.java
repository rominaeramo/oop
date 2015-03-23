package lezione10;

 
import java.util.*;

class C30 {
	public int x;
	public int y;
	
	public String toString(){
		return "C x: " + x + " y: " +y;
	}
}

public interface RandVals {
  C30 c = new C30();
  Random rand = new Random();
  int randomInt = rand.nextInt(10);
  long randomLong = rand.nextLong() * 10;
  float randomFloat = rand.nextLong() * 10;
  double randomDouble = rand.nextDouble() * 10;
} 
