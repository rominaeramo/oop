package lezione4;



public class Switch2 {

	static boolean checkAnswer (char c) { 
		boolean res; 
		switch (c) { 
			case 'y': 
				res = true; 
				break;
			default: 
				res = false; 
		} 
		return res;
	}
	
	
	public static void main(String args[]){
		char x='y';
		System.out.println(checkAnswer(x));	
	}
	
}
