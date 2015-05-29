package lezione12;

import java.util.*;


public class StackL {

  private LinkedList list = new LinkedList();
  public void push(Object v) { list.addFirst(v); }
  public Object top() { return list.getFirst(); }
  public Object pop() { return list.removeFirst(); }
  public static Random gen = new Random();
  
  public String toString() {
	ListIterator listIterator = list.listIterator();
	StringBuffer s = new StringBuffer();
	
	s.append("{");
	while (listIterator.hasNext()){
		s.append(listIterator.next()+" -> ");
	}
	s.append("_ }");
	
	return s.toString();
  }
  
  
  
  public static void main(String[] args) {
    StackL stack = new StackL();
    for(int i = 0; i < 10; i++)
      stack.push(gen.nextInt(20));
    
    System.out.println(stack);	//Ridefinire il toString()

    System.out.println(stack.top());
    stack.push(18);
    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
  
}  
