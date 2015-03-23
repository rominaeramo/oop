/**
 * 
 */
package esempi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */
public class Collezione {
	/*public static <E>Collection<E> intersect(Collection<E> x, Collection<E> y){
		Collection<E> inter = new HashSet<E>();
		for (E i : x){
			for(E j : y) {
				if(i.equals(j)){
					inter.add(i);
				}
			}
		}
		return inter;*/
	public static <E> Collection <E> intersect (Collection<E> x, Collection<E> y){
		Iterator a = x.iterator();
		Iterator b = y.iterator();
		Collection <E> z = new ArrayList<E>();
		E j = (E)a.next();
		E k = (E)b.next();
		while(a.hasNext()){
			while(b.hasNext()){
				if (j==k){
					z.add((E)j);
				}
				k = (E)b.next();
			}
			j = (E)a.next();
		}
		return z;
	}
	/*public static Collection<T> intersect (Collection x, Collection y){
		Collection<T> z = new ArrayList<T>();
		z.addAll(x);
		z.retainAll(y);
		return z;
	
	}*/
	public static void main(String[] args) {
		Collection<String> a = new ArrayList<String>();
		a.add("pippo");
        a.add("pluto");
        System.out.println(a.toString());
		Collection<String> b = new ArrayList<String>();
		b.add("pippo");
        b.add("minnie");
        System.out.println(b.toString());
		Collection<String> intersect = intersect(a, b);
		System.out.println(intersect.toString());
	}
	/*public static Collection<Integer> intersect(Collection<Integer> x, Collection<Integer> y){
		Collection<Integer> result = new LinkedList<Integer>();
		for (Integer i : x){
			for(Integer j : y) {
				if(i.equals(j)){
					result.add(j);
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Collection<Integer> a = new ArrayList<Integer>();
		a.add(1);
        a.add(3);
        System.out.println(a.toString());
		Collection<Integer> b = new ArrayList<Integer>();
		b.add(1);
        b.add(2);
        System.out.println(b.toString());
		Collection<Integer> intersect = intersect(a, b);
		System.out.println(intersect.toString());
	}*/
}
