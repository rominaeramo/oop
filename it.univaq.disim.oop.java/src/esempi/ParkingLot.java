/**
 * 
 */
package esempi;

import java.util.*;

class Pair<T> {
	private int first, second;
	public Pair(int x, int y){
		this.first = x;
		this.second = y;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}	
}


public class ParkingLot {
    private int n , m;
    private LinkedList<Pair> l = new LinkedList<>();
    private Map<Pair, Date> parcheggio = new HashMap<>();
    public ParkingLot(int n , int m) {
        this.n = n;
        this.m = m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Pair p = new Pair(i, j);
                parcheggio.put(p, null);
                l.add(p);
            }
        }
       
    }
    public Pair carIn() {
        Pair last = l.removeFirst();
        if (parcheggio.get(last) == null) {
            Date d = new Date();
            parcheggio.put(last, d);           
        }
        return last;
       
    } 
    public int carOut(Pair p) {
        Date d = parcheggio.get(p);
        Date now = new Date();
       
        if (d != null) {
            int r =  (int) (now.getTime() - d.getTime()) ;
            return r / 1000 ;
        }
        return -1;
    }
    public static void main(String[] args) throws InterruptedException {
       ParkingLot p = new ParkingLot(4,4);
       
       Pair<Integer> pos1 = p.carIn();
       Pair<Integer> pos2 = p.carIn();
       Thread.sleep(1000);
       int sec1 = p.carOut(pos1);
       Thread.sleep(1000);
       int sec2 = p.carOut(pos2);
        System.out.println("("+pos1.getFirst()+", "+pos1.getSecond()+"), "+sec1);
        System.out.println("("+pos2.getFirst()+", "+pos2.getSecond()+"), "+sec2);
    }
}