package lezione8;

abstract class Tree2 {
	abstract int getSize();
	public void f(){
		System.out.println("f() di Tree2");
	}
}

class Node2 extends Tree2 {
  Tree2 right;
  Tree2 left;
  Node2 (Tree2 left, Tree2 right) {
    this.left = left;
    this.right = right;
  }
  int getSize() {
    return left.getSize() + right.getSize();		
  }
  public void f(){
		System.out.println("f() di Node");
	}
  
}

class Leaf2 extends Tree2 {
  String s;
  Leaf2 (String s) {
    this.s = s;
  }
  int getSize() {
	    return 1;
  }

}



public class Abstract2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree2 t = new Node2(new Node2(new Leaf2("a"), new Leaf2("b")), new Leaf2("c"));

		System.out.println("Size di t " + t.getSize());
		Leaf2 l = new Leaf2("f");
		t.f();
		l.f();
	}

}
