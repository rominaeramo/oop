package exercises;

public class A2 {

  int method(A2 a) {
    return 1;
  }

}

class B2 extends A2  {

	int method(A2  a) {
		return 2;
	}
	
	int method(B2  a) {
		return 3;
	}

}


