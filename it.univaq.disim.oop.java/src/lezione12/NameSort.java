package lezione12;

import java.util.*;

class NameSort {
    public static void main(String args[]) {
        Name n[] = {
            new Name("John", "Lennon"),
            new Name("Karl", "Marx"),
            new Name("Groucho", "Marx"),
            new Name("Oscar", "Grouch")
            };
        List l = Arrays.asList(n);
        Collections.sort(l);
        System.out.println(l);
    }
}
