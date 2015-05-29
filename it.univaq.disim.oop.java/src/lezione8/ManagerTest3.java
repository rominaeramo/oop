/**
 * 
 */
package lezione8;

/**
 * @author romina
 *
 */
public class ManagerTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]);
		Employee e = null;
		if (x == 5) {
			
			e = new Employee(null, x, x, x, x);
			
		} else {
			
			e = new Manager(null, x, x, x, x);
			
		}
		System.out.println(e.getSalary());
		
		//Manager m = e; //errore in compilazione
		Manager m = (Manager) e;  
		m.setBonus(50);
	}

}
