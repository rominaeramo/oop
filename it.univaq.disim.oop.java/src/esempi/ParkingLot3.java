/**
 * 
 */
package esempi;

import java.util.*;

public class ParkingLot3 {
	private Date[][] parcheggio;
    
    public ParkingLot3(int n , int m) {
        parcheggio = new Date[m][n];
       
    }
    public Pair<Integer> carIn() {
    		
    		for (int i = 0; i < parcheggio.length; i++) {
             for (int j = 0; j < parcheggio[i].length; j++) {
                if(parcheggio[i][j] == null) {
                	 parcheggio[i][j] = new Date(); //now
                	 return new Pair<Integer>(i,j);
                }
             }
         }
        return null ;
    }
    
    public Integer carOut(Pair<Integer> p) {
        Date d = parcheggio[p.getFirst()][p.getSecond()];
        if(d == null) {
           return null; 
        }
        return (int) (new Date().getTime() - d.getTime()); 
    }
    
    
    
    public static void main(String[] args) throws InterruptedException {
       ParkingLot3 p = new ParkingLot3(4,4);
       
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