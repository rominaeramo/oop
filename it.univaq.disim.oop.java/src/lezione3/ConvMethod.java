package lezione3;

class ConvMethod {
	static int m(byte a, byte b) { 
		System.out.println("Sono m(byte,byte) ");
		return a+b; 	
	}
	
/*	static int m(short a, short b) { 
		System.out.println("Sono m(short,short) ");
		return a-b; 	
	}
*/
	
	static long m(int a, long b){
		System.out.println("Sono m(int,long) ");
		return a-b; 
	}
	
	static long m(long a, int b){
		System.out.println("Sono m(long,int) ");
		return a-b; 
	}
	
	//Prova a commentare il seguente metodo
	static long m(int a, int b) { 	
		System.out.println("Sono m(int,int) ");
		return a-b; 
		
	}

	static long m(long a, long b) { 	
		System.out.println("Sono m(long,long) ");
		return a-b; 
		
	}
	
	public static void main(String[] args) {
		long i=12;
		long j=2;
		
		short x=12;
		short y=13;
		
		System.out.println(m((int)i,(int) j));
		System.out.println(m(i,j));
		
		System.out.println(m(x,y));
		
		//short s3 = 0x1ffff; 
	}
}
