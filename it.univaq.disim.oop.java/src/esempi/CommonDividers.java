package esempi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*public class CommonDividers<T> extends ArrayList<Integer>{

	public CommonDividers(T x, T y){
		super();
		int min;
		if((Integer) x > (Integer) y) {
			min = (Integer) y;
		} else {
			min = (Integer) x;
		}
		for (int j =1 ; j <= min ; j ++) {
			if ((Integer)x % j == 0){
				if ((Integer)y % j == 0) {
					this.add(j);
				}
			}
		}
		
	}*/
public class CommonDividers<T> implements Iterable<T>{	
	private int max;
	private int min;
	private List<Integer> l = new ArrayList<Integer>();
	CommonDividers(int i, int j) {
		if(i >= j)
			this.max = i;
		else 
			this.min = j;
		calculate();
	}
	private void calculate() {
		for(int i = 1; i < min/2; i++){
			if ((min%i ==0) && (max%i ==0)){
				l.add(i);
			}
		}
	}
	public Iterator<T> iterator() {
		return (Iterator<T>) l.iterator();
		
	}
	
	public static void main(String[] args){
		for (Integer n : new CommonDividers<Integer>(12, 60))
		System.out.println( n + " ");
	}

	
	
}