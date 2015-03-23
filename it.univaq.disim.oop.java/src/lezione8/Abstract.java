package lezione8;

class Tree {
	
}

class Node extends Tree {
  Tree right;
  Tree left;
  Node (Tree left, Tree right) {
    this.left = left;
    this.right = right;
  }
  //int getSize() {
  //   return left.getSize() + right.getSize();	//	Errore perche' la classe Tree non ha il metodo getSize()
  //}
}
class Leaf extends Tree {
  String s;
  Leaf (String s) {
    this.s = s;
  }
  int getSize() {
	    return 1;
  }

}



public class Abstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree t = new Node(new Node(new Leaf("a"), new Leaf("b")), new Leaf("c"));

		
	}

}
