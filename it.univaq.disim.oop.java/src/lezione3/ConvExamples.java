package lezione3;



class ConvExamples {                      

	public static void myFunction(int i){
		
	}
	
	public static void main(String[] args) {
            // Casting conversion  of a float literal to
            // type int. Without the cast operator, this would
            // be a compile-time error, because this is a
            // narrowing conversion (§5.1.3):
            int i = (int)12.5f;

            // String conversion  of i's int value:
            System.out.println("(int)12.5f==" + i);

            // Assignment conversion of i's value to type
            // float. This is a widening conversion (§5.1.2):
            float f = i;

            // String conversion of f's float value:
            System.out.println("after float widening: " + f);

            // Numeric promotion  of i's value to type
            // float. This is a binary numeric promotion.
            // After promotion, the operation is float*float:
            System.out.print(f);
            f = f * i;

            // Two string conversions of i and f:
            System.out.println("*" + i + "==" + f);

            // Method invocation conversion  of f's value
            // to type double, needed because the method Math.sin
            // accepts only a double argument:
            double d = Math.sin(f);
            
            //myFunction(f); An explicit cast is requireed

            // Two string conversions of f and d:
            System.out.println("Math.sin(" + f + ")==" + d);

    }
}
