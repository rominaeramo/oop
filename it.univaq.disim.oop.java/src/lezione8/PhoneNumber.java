package lezione8;

public final class PhoneNumber {
	   private final short areaCode;
	   private final short exchange;
	   private final short extension;
	   
	   public PhoneNumber(int areaCode, int exchange,int extension) {
	      rangeCheck(areaCode, 999, "area code");
	      rangeCheck(exchange, 999, "exchange");
	      rangeCheck(extension, 9999, "extension");
	     this.areaCode = (short) areaCode;
	     this.exchange = (short) exchange;
	     this.extension = (short) extension;
	   }
	      
	  private static void rangeCheck(int arg, int max, String name){	      
	 	if (arg < 0 || arg > max)	
 		throw new IllegalArgumentException(name +": " + arg);
	  }
	   
	   //Prova a commentare la definizione del metodo
	 
	  public boolean equals(Object o) {
	     if (o == this) return true;					//Proprietà riflessiva
	     if (!(o instanceof PhoneNumber)) return false;
	     PhoneNumber pn = (PhoneNumber)o;
	     return pn.extension == extension && pn.exchange == exchange && 
	            pn.areaCode == areaCode;
	   }
	  
	
	   //Prova a commentare la definizione del metodo
	   public String toString() {
		   return "("+ areaCode +")" + exchange + "-" + extension;
	   }
	 
	   
}

class PhoneNumberTest {
	
	
	public static void main(String args[]){
		PhoneNumber p1 = new PhoneNumber(888,222,777);
		PhoneNumber p2 = new PhoneNumber(888,222,777);

		//float f = Float.parseFloat("9.4");
		p1=p2;
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.toString());
	}
	
	
	
}
