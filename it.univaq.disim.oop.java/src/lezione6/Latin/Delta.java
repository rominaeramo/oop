package lezione6.Latin;

import lezione6.Greek.Alpha2;

public class Delta extends Alpha2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alpha2 aAlpha2 = new Alpha2();
		//aAlpha2.iamprotected++;  //Illegal
		Delta aDelta = new Delta();
		aDelta.iamprotected++;
		

	}

}
