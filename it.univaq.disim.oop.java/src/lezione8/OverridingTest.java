package lezione8;

class Base {
	//String greeting() { return "Goodnight";}		//(1)
	static String greeting() { return "Goodnight";}	
	//String name() { return "Richard";}			//(2)
	static String name() { return "Richard";}		//(3)
}

class Sub extends Base {
	//String greeting() { return "Hello";}			//(1)
	static String greeting() { return "Hello";}			
	
	static String name() { return "Dick";}		//(2)
	//String name() { return "Dick";}				//(3)
	
}
	

public class OverridingTest {
	public static void main(String[] args) {
		Base b = new Sub();
		System.out.println(b.greeting() + ", " + b.name());
		
		Sub s = new Sub();
		//System.out.println(s.greeting() + ", " + s.name());
		
		//System.out.println("Test con cast " + ((Sub) b).greeting()); 
		
		//System.out.println((new Sub()).greeting() + ", " + s.name());	//(1)
		//System.out.println(Sub.greeting() + ", " + s.name());
		
		
   }
}
