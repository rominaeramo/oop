/* The InstrumentedSet class is known as a wrapper class because 
 * each InstrumentedSet instance contains (“wraps”) another Set instance. 
 */
package lezione16;

import java.util.Collection;
import java.util.Set;

//Wrapper class - uses composition in place of inheritance
public class InstrumentedSet2<E> extends ForwardingSet<E> {
	private int addCount = 0;
	public InstrumentedSet2(Set<E> s) {
	super(s);
	}
	@Override public boolean add(E e) {
	addCount++;
	return super.add(e);
	}
	@Override public boolean addAll(Collection<? extends E> c) {
	addCount += c.size();
	return super.addAll(c);
	}
	public int getAddCount() {
	return addCount;
	}
}
