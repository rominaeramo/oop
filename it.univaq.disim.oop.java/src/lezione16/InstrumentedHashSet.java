package lezione16;

import java.util.*;
public class InstrumentedHashSet<E> extends HashSet<E> {
    // The number of attempted element insertions
    private int addCount = 0;

    public InstrumentedHashSet() {
    }
    public InstrumentedHashSet(Collection<E> c) {
        super(c);
    }
    public InstrumentedHashSet(int initCap,float loadFactor) {
        super(initCap, loadFactor);
    }
    public boolean add(E o) {
        addCount++;
        return super.add(o);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap","Crackle","Pop"));
        System.out.println(s.getAddCount());
    }
}
