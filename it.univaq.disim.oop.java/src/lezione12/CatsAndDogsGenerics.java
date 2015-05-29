package lezione12;

import java.util.ArrayList;
import java.util.List;

public class CatsAndDogsGenerics {
	
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<Cat>();
		for(int i = 0; i < 7; i++)
			cats.add(new Cat(i));

		//cats.add(new Dog(7));
	
		for(int i = 0; i<cats.size(); i++)
			//((Cat)cats.get(i)).id(); Il cast non e' piu' necessario
			cats.get(i).id();
	}	

}
