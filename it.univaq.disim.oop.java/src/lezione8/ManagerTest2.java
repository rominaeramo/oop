package lezione8;

public class ManagerTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]);
		Employee e = null; 
		if (x == 3) {
			e = new Employee(null, 20000, x, x, x);
		} else {
			e = new Manager(null, 50000, x, x, x);
		}
		System.out.println(e.getSalary());
		Manager m = (Manager) e;
		m.setBonus(30);
		System.out.println(m.getSalary());
	}

}
