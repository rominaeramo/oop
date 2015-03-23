/**
 * 
 */
package esempi;

import java.util.*;

public class ParkingLot2 {
	Date[][] park;
    
    public ParkingLot2(int n , int m) {
        park = new Date[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               park[i][j] = null;
            }
        }
       
    }
    public Pair<Integer> carIn() {
    	 for (int i = 0; i < park.length; i++) {
             for (int j = 0; j < park[i].length; j++) {
                if(park[i][j] == null) {
                	 int x = i;
                	 int y = j;
                	 park[i][j] = new Date(); //now
                	 return new Pair(x,y);
                	 
                }
             }
         }
        return null;
    }
    
    public int carOut(Pair p) {
        int i = p.getFirst();
        int j = p.getSecond();
        
        if(park[i][j] == null) {
           System.out.println("Nessuna auto parcheggiata qui!");
           return -1; 
        }
        Date d = park[i][j];
        park[i][j] = null; 
        Date f = new Date(); //now
        return (int) (f.getTime() - d.getTime()); //f-d
    }
    
    
    
    public static void main(String[] args) throws InterruptedException {
       ParkingLot2 p = new ParkingLot2(4,4);
       
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